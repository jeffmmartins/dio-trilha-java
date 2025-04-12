import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contato;

    // construtor
    public AgendaContatos() {
        this.contato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contato.add(new Contato(nome, numero));
    }
}
