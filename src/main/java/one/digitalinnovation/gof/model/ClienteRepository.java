package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório para operações CRUD com a entidade Cliente.
 *
 * Esta interface estende o CrudRepository fornecendo métodos padrão para
 * operações de criação, leitura, atualização e exclusão (CRUD) de objetos
 * do tipo Cliente.
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
