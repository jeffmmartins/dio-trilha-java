public class Item {
    private String nome;
    private String preco;
    private String quaantidade;

    // construtor padrão;
    public Item(){

    }

    public Item(String nome, String preco, String quaantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quaantidade = quaantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getQuaantidade() {
        return quaantidade;
    }
}
