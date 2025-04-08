import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    public List<Pessoa> ordenarPorIdade(){
        //list não está vazia pois precisa ordenar por idade, por isso está duplicando
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listpessoa);
        //Ordenar as pessoas por idade atraves do comparable.
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
}


