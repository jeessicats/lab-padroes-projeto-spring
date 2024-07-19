package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entidade que representa um endereço no sistema.
 *
 * Esta classe é mapeada para a tabela de endereços no banco de dados, onde
 * cada endereço é identificado pelo CEP.
 */
@Entity
public class Endereco {

    @Id
    private String cep; // CEP do endereço (identificador único)

    private String logradouro; // Logradouro (rua, avenida, etc.)
    private String complemento; // Complemento do endereço (apt, bloco, etc.)
    private String bairro; // Bairro do endereço
    private String localidade; // Localidade (cidade)
    private String uf; // Unidade Federativa (estado)
    private String ibge; // Código IBGE do município
    private String gia; // Código GIA (Grupo de Identificação de Agências)
    private String ddd; // Código DDD (Discagem Direta à Distância)
    private String siafi; // Código SIAFI (Sistema de Administração dos Recursos da Folha de Pagamento)

    /**
     * Obtém o CEP do endereço.
     *
     * @return CEP do endereço.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o CEP do endereço.
     *
     * @param cep CEP do endereço.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Obtém o logradouro do endereço.
     *
     * @return Logradouro do endereço.
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Define o logradouro do endereço.
     *
     * @param logradouro Logradouro do endereço.
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Obtém o complemento do endereço.
     *
     * @return Complemento do endereço.
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o complemento do endereço.
     *
     * @param complemento Complemento do endereço.
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * Obtém o bairro do endereço.
     *
     * @return Bairro do endereço.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro do endereço.
     *
     * @param bairro Bairro do endereço.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém a localidade do endereço.
     *
     * @return Localidade (cidade) do endereço.
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * Define a localidade do endereço.
     *
     * @param localidade Localidade (cidade) do endereço.
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * Obtém a Unidade Federativa (estado) do endereço.
     *
     * @return Unidade Federativa do endereço.
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define a Unidade Federativa (estado) do endereço.
     *
     * @param uf Unidade Federativa do endereço.
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Obtém o código IBGE do município.
     *
     * @return Código IBGE do município.
     */
    public String getIbge() {
        return ibge;
    }

    /**
     * Define o código IBGE do município.
     *
     * @param ibge Código IBGE do município.
     */
    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    /**
     * Obtém o código GIA (Grupo de Identificação de Agências).
     *
     * @return Código GIA.
     */
    public String getGia() {
        return gia;
    }

    /**
     * Define o código GIA (Grupo de Identificação de Agências).
     *
     * @param gia Código GIA.
     */
    public void setGia(String gia) {
        this.gia = gia;
    }

    /**
     * Obtém o código DDD (Discagem Direta à Distância).
     *
     * @return Código DDD.
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * Define o código DDD (Discagem Direta à Distância).
     *
     * @param ddd Código DDD.
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * Obtém o código SIAFI (Sistema de Administração dos Recursos da Folha de Pagamento).
     *
     * @return Código SIAFI.
     */
    public String getSiafi() {
        return siafi;
    }

    /**
     * Define o código SIAFI (Sistema de Administração dos Recursos da Folha de Pagamento).
     *
     * @param siafi Código SIAFI.
     */
    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

}