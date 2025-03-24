//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // e é uma variavel do tipo estadoBrasileiro
        for (EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNome() + " - " + e.getSigla());
        }
    }
}