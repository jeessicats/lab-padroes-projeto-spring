package one.digitalinnovation.gof.service.validator;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class EnderecoValidator implements ClienteValidator {
    @Override
    public boolean validar(Cliente cliente) {
        return cliente.getEndereco() != null && cliente.getEndereco().getCep() != null;
    }
}