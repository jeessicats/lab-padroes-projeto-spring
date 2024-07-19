package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Classe principal do aplicativo Spring Boot.
 *
 * Esta classe contém o método principal que inicializa a aplicação Spring Boot.
 *
 * A anotação {@link SpringBootApplication} é uma conveniência que inclui as seguintes
 * anotações: {@link org.springframework.context.annotation.Configuration},
 * {@link org.springframework.context.annotation.ComponentScan} e
 * {@link org.springframework.boot.autoconfigure.SpringBootApplication}.
 *
 * A anotação {@link EnableFeignClients} é usada para ativar o suporte ao OpenFeign,
 * permitindo a criação e uso de clientes HTTP baseados em interfaces para integração com APIs externas.
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     *
     * @param args Argumentos da linha de comando passados para o aplicativo.
     */
    public static void main(String[] args) {
        // Inicializa a aplicação Spring Boot
        SpringApplication.run(Application.class, args);
    }

}
