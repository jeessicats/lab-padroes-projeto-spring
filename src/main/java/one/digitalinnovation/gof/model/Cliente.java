package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entidade que representa um cliente no sistema.
 *
 * Esta classe é mapeada para a tabela de clientes no banco de dados.
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Identificador único do cliente (gerado automaticamente)

    private String nome; // Nome do cliente

    @ManyToOne
    private Endereco endereco; // Endereço associado ao cliente

    /**
     * Obtém o ID do cliente.
     *
     * @return ID do cliente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o ID do cliente.
     *
     * @param id ID do cliente.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return Nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome Nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return Endereço associado ao cliente.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco Endereço associado ao cliente.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}