package one.digitalinnovation.gof.service.validator;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NomeValidator implements ClienteValidator {
    @Override
    public boolean validar(Cliente cliente) {
        return cliente.getNome() != null && !cliente.getNome().isEmpty();
    }
}