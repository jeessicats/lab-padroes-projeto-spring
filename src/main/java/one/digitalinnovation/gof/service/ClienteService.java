package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define os contratos de serviço para a entidade {@link Cliente}.
 * Utiliza o padrão <b>Strategy</b> para permitir a implementação de diferentes estratégias de serviço para {@link Cliente}.
 */
public interface ClienteService {

    /**
     * Recupera todos os clientes.
     *
     * @return Iterable de {@link Cliente} contendo todos os clientes registrados.
     */
    Iterable<Cliente> buscarTodos();

    /**
     * Recupera um cliente específico pelo seu ID.
     *
     * @param id O ID do cliente a ser recuperado.
     * @return O {@link Cliente} correspondente ao ID fornecido.
     */
    Cliente buscarPorId(Long id);

    /**
     * Insere um novo cliente.
     *
     * @param cliente O cliente a ser inserido.
     */
    void inserir(Cliente cliente);

    /**
     * Atualiza as informações de um cliente existente.
     *
     * @param id O ID do cliente a ser atualizado.
     * @param cliente O cliente com as novas informações.
     */
    void atualizar(Long id, Cliente cliente);

    /**
     * Remove um cliente pelo seu ID.
     *
     * @param id O ID do cliente a ser removido.
     */
    void deletar(Long id);
}
