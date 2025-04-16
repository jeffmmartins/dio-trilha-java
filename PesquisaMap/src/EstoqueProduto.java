import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributos, codigo do tipo long, como se fosse uma identificação unica para o objeto produto;
    private Map<Long,Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutoMap.put(cod, new Produto(nome,preco,quantidade));
    }
}
