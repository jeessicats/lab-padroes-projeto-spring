package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Endereco;

/**
 * Interface para comunicação com a API do ViaCEP usando OpenFeign.
 * O OpenFeign é uma ferramenta que facilita a criação de clientes HTTP baseados em interface.
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    /**
     * Recupera os dados de um endereço a partir do CEP fornecido.
     *
     * @param cep O CEP do endereço a ser consultado.
     * @return Um objeto {@link Endereco} contendo as informações do endereço associado ao CEP fornecido.
     */
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
