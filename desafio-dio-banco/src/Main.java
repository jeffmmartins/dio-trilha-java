import entities.Conta;
import entities.ContaConrrente;
import entities.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaConrrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}