import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributo como list
    private List<Item> itensProduto;

    public CarrinhoDeCompras(List<Item> itensProduto) {
        //inicializando o itensprodutos com uma array vazio.
        this.itensProduto = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensProduto.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        // variavel de escopo que é uma lista do tipo item , com array vazio;
        List<Item> remocaoItem = new ArrayList<>();
        for (Item item : itensProduto) {
            if (item.getNome().equalsIgnoreCase(nome)){
                remocaoItem.add(item);
            }
        }
        itensProduto.removeAll(remocaoItem);
    }

    public int obterNumeroTotalTarefas(){
        return itensProduto.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(itensProduto);
    }
}
