import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       analisarCandidato(3000.0);
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Jeff", "Martins", "Mendes", "Vera", "lucia", "Francisco", "Assis", "Fatima", "Vanda", "Julimar"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O Canditado " + candidato + " Solicitou este valor de sálario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + " Foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("ligar para o canditado com uma contra proposta");
        }else{
            System.out.println("Aguuardando resultado dos demais candidatos");
        }
    }
}