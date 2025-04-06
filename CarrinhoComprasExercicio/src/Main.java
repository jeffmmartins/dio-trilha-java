import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cafeteira", 300, 2);
        carrinhoDeCompras.adicionarItem("Tablet", 1000, 2);
        carrinhoDeCompras.adicionarItem("Cama", 1200, 2);

        carrinhoDeCompras.removerItem("Cama");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();



    }
}