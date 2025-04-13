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

    public void exibirContato(){
        System.out.println(contato);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPornome = new HashSet<>();
        for (Contato c : contato){
            if (c.getNome().startsWith(nome)){
                contatoPornome.add(c);
            }
        }
        return contatoPornome;
    }

    public Contato atualizarContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato c : contato ) {
            // condição for true, é feito alteração do número;
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
