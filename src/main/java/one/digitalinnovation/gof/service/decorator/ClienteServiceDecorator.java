package one.digitalinnovation.gof.service.decorator;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Decorador para a interface {@link ClienteService}.
 *
 * Essa classe implementa o padrão de projeto Decorator, que permite adicionar
 * funcionalidades adicionais à interface {@link ClienteService} sem modificar a
 * implementação original. Nesse caso, adiciona-se logging (exibição de mensagens)
 * antes e depois das operações básicas do serviço.
 */
@Component
public class ClienteServiceDecorator implements ClienteService {

    // Referência para o serviço de cliente original.
    private final ClienteService clienteService;

    /**
     * Construtor que injeta a instância do serviço de cliente.
     *
     * @param clienteService A implementação real do serviço de cliente a ser decorada.
     */
    @Autowired
    public ClienteServiceDecorator(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Delegar a chamada para o serviço original.
        return clienteService.buscarTodos();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // Delegar a chamada para o serviço original.
        return clienteService.buscarPorId(id);
    }

    @Override
    public void inserir(Cliente cliente) {
        // Adicionar funcionalidade adicional (logging) antes da chamada real.
        System.out.println("Inserindo cliente: " + cliente.getNome());
        // Delegar a chamada para o serviço original.
        clienteService.inserir(cliente);
        // Adicionar funcionalidade adicional (logging) após a chamada real.
        System.out.println("Cliente inserido com sucesso.");
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Adicionar funcionalidade adicional (logging) antes da chamada real.
        System.out.println("Atualizando cliente ID: " + id);
        // Delegar a chamada para o serviço original.
        clienteService.atualizar(id, cliente);
        // Adicionar funcionalidade adicional (logging) após a chamada real.
        System.out.println("Cliente atualizado com sucesso.");
    }

    @Override
    public void deletar(Long id) {
        // Adicionar funcionalidade adicional (logging) antes da chamada real.
        System.out.println("Deletando cliente ID: " + id);
        // Delegar a chamada para o serviço original.
        clienteService.deletar(id);
        // Adicionar funcionalidade adicional (logging) após a chamada real.
        System.out.println("Cliente deletado com sucesso.");
    }
}
