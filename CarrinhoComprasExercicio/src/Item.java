public class Item {
    private String nome;
    private double preco;
    private int quaantidade;


    // construtor padrão;
    public Item(){

    }

    public Item(String nome, double preco, int quaantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quaantidade = quaantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuaantidade() {
        return quaantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quaantidade=" + quaantidade +
                '}';
    }
}
