package one.digitalinnovation.gof.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;
import one.digitalinnovation.gof.service.factory.ClienteFactory;
import one.digitalinnovation.gof.service.validator.ClienteValidator;
import java.util.List;

/**
 * Implementação do serviço de {@link Cliente}, definindo as regras de negócio e integrações necessárias.
 * Utiliza padrões de design como <b>Strategy</b> e <b>Decorator</b> para validação e criação de clientes.
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository; // Repositório para operações CRUD com Cliente

    @Autowired
    private EnderecoRepository enderecoRepository; // Repositório para operações CRUD com Endereço

    @Autowired
    private ViaCepService viaCepService; // Serviço para integração com a API ViaCEP

    @Autowired
    private ClienteFactory clienteFactory; // Fábrica para criar instâncias de Cliente

    @Autowired
    private List<ClienteValidator> clienteValidators; // Lista de validadores de Cliente

    /**
     * Recupera todos os clientes do repositório.
     *
     * @return Iterable de {@link Cliente}
     */
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    /**
     * Recupera um cliente por seu ID.
     *
     * @param id O ID do cliente a ser recuperado.
     * @return O {@link Cliente} encontrado ou null se não encontrado.
     */
    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    /**
     * Insere um novo cliente no repositório após validação.
     *
     * @param cliente O cliente a ser inserido.
     * @throws IllegalArgumentException Se o cliente não for válido.
     */
    @Override
    public void inserir(Cliente cliente) {
        if (validarCliente(cliente)) {
            salvarClienteComCep(cliente);
        } else {
            throw new IllegalArgumentException("Cliente inválido");
        }
    }

    /**
     * Atualiza um cliente existente no repositório após validação.
     *
     * @param id O ID do cliente a ser atualizado.
     * @param cliente Os novos dados do cliente.
     * @throws IllegalArgumentException Se o cliente não for válido ou não existir.
     */
    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent() && validarCliente(cliente)) {
            salvarClienteComCep(cliente);
        } else {
            throw new IllegalArgumentException("Cliente inválido");
        }
    }

    /**
     * Remove um cliente do repositório pelo ID.
     *
     * @param id O ID do cliente a ser removido.
     */
    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    /**
     * Salva um cliente no repositório e garante que o endereço esteja presente e atualizado.
     *
     * @param cliente O cliente a ser salvo.
     */
    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    /**
     * Valida um cliente usando uma lista de validadores.
     *
     * @param cliente O cliente a ser validado.
     * @return true se o cliente for válido, false caso contrário.
     */
    private boolean validarCliente(Cliente cliente) {
        for (ClienteValidator validator : clienteValidators) {
            if (!validator.validar(cliente)) {
                return false;
            }
        }
        return true;
    }
}
