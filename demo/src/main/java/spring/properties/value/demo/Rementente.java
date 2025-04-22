package spring.properties.value.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "rementente")
public class Rementente {

    private String nome;
    private String email;
    private List<Long> numero = new ArrayList<>(Arrays.asList(new Long[]{85997933289L}));

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getNumero() {
        return numero;
    }

    public void setNumero(List<Long> numero) {
        this.numero = numero;
    }
}
