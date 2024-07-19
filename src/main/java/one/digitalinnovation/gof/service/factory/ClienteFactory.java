package one.digitalinnovation.gof.service.factory;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;

/**
 * Interface que define o padrão <b>Factory Method</b> para a criação de objetos {@link Cliente}.
 *
 * O padrão Factory Method é utilizado para criar objetos sem especificar a classe exata do objeto
 * que será criado. Em vez disso, a interface fornece um método para criar o objeto, permitindo
 * que as subclasses decidam qual implementação será instanciada.
 */
public interface ClienteFactory {

    /**
     * Cria uma instância de {@link Cliente} com o nome e endereço fornecidos.
     *
     * @param nome O nome do cliente.
     * @param endereco O endereço do cliente.
     * @return Uma nova instância de {@link Cliente} com os dados fornecidos.
     */
    Cliente criarCliente(String nome, Endereco endereco);
}
