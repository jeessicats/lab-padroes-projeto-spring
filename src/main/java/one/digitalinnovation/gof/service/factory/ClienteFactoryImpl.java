package one.digitalinnovation.gof.service.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import org.springframework.stereotype.Component;

/**
 * Implementação concreta do padrão <b>Factory Method</b> para a criação de objetos {@link Cliente}.
 *
 * Esta classe implementa a interface {@link ClienteFactory} e define o método para criar instâncias
 * de {@link Cliente}. Utilizando o padrão Factory Method, permite a criação de objetos sem expor a
 * lógica de criação ao cliente.
 */
@Component
public class ClienteFactoryImpl implements ClienteFactory {

    /**
     * Cria uma nova instância de {@link Cliente} com os dados fornecidos.
     *
     * @param nome O nome do cliente.
     * @param endereco O endereço do cliente.
     * @return Uma nova instância de {@link Cliente} com o nome e endereço fornecidos.
     */
    @Override
    public Cliente criarCliente(String nome, Endereco endereco) {
        Cliente cliente = new Cliente();  // Cria uma nova instância de Cliente
        cliente.setNome(nome);            // Define o nome do cliente
        cliente.setEndereco(endereco);    // Define o endereço do cliente
        return cliente;                   // Retorna a instância criada
    }
}
