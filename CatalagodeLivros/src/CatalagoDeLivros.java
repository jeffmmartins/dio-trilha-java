import java.util.ArrayList;
import java.util.List;

public class CatalagoDeLivros {
    //Atributo
    List<Livro> listLivros;

    //  Ao instanciar o objeto vai ser intanciado com o arrray vazio;
    public CatalagoDeLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    // está como lista porque pode ter mais de um  livro por autor, então vai ter o retorno de lista;
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        // verificando se a lista está vazia.
        if (!listLivros.isEmpty()){
            for (Livro l : listLivros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    // adicionando o livro na lista vazia: livroPorAutor
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!listLivros.isEmpty()){
            for (Livro l : listLivros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listLivros.isEmpty()){
            for (Livro l : listLivros){
                // utilizando o break porque o primeiro tirulo que achar o laço termina;
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
