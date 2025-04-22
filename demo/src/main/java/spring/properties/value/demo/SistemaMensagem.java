package spring.properties.value.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    //aplicando o properties

    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${numero}")
    private List<Long> numero = new ArrayList<>(Arrays.asList(new Long[]{85997933289L}));


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome + " pro e-mail: " +
                email + " Com telefone para contato " + numero );
        System.out.println("Registro cadastrado");
    }
}
