package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para a entidade {@link Endereco}.
 *
 * Esta interface estende {@link CrudRepository}, fornecendo operações CRUD básicas
 * para a entidade Endereco. O identificador da entidade Endereco é do tipo String (CEP).
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

    // Métodos padrão para CRUD (Create, Read, Update, Delete) são herdados do CrudRepository.
    // Não são necessários métodos adicionais para operações básicas.

}
