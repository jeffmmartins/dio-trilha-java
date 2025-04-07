import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    // atributo
    List<Pessoa> listpessoa;

    //construtor
    public OrdenacaoPessoa() {
        this.listpessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listpessoa.add(new Pessoa(nome, idade, altura));
    }
}
