package one.digitalinnovation.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

/**
 * Controlador REST para gerenciar clientes.
 *
 * Este controlador fornece uma interface simples e coesa (API REST) para interagir com
 * o serviço de cliente. Ele atua como uma fachada, abstraindo a complexidade da lógica de
 * negócios e integrações com o banco de dados.
 */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService; // Serviço para operações com clientes

    /**
     * Endpoint para buscar todos os clientes.
     *
     * @return ResponseEntity com a lista de todos os clientes.
     */
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        // Chama o serviço para obter todos os clientes e retorna como resposta.
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    /**
     * Endpoint para buscar um cliente por ID.
     *
     * @param id ID do cliente a ser buscado.
     * @return ResponseEntity com o cliente encontrado.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        // Chama o serviço para obter um cliente pelo ID e retorna como resposta.
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    /**
     * Endpoint para inserir um novo cliente.
     *
     * @param cliente Cliente a ser inserido.
     * @return ResponseEntity com o cliente inserido.
     */
    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        // Chama o serviço para inserir o cliente e retorna o cliente inserido.
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    /**
     * Endpoint para atualizar um cliente existente.
     *
     * @param id ID do cliente a ser atualizado.
     * @param cliente Dados atualizados do cliente.
     * @return ResponseEntity com o cliente atualizado.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        // Chama o serviço para atualizar o cliente e retorna o cliente atualizado.
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    /**
     * Endpoint para deletar um cliente por ID.
     *
     * @param id ID do cliente a ser deletado.
     * @return ResponseEntity sem conteúdo, indicando sucesso.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        // Chama o serviço para deletar o cliente pelo ID e retorna resposta de sucesso.
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}