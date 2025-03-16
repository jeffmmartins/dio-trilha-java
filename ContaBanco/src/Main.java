import Entities.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero = 1021;
        System.out.println();
        System.out.println("Por favor digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nome,saldo);

        System.out.println(contaTerminal.toString());


        scanner.close();
    }
}