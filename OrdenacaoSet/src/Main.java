//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1l,"produto5", 15d, 5);
        cadastroProdutos.adicionarProduto(2l,"produto2", 20d, 10);
        cadastroProdutos.adicionarProduto(1l,"produto4", 10d, 2);
        cadastroProdutos.adicionarProduto(9l,"produto5", 2d, 2);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}