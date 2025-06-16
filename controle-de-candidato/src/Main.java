import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [] candidatos = {"Jeff", "Martins", "Mendes", "Vera", "lucia"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizada++;
            }else{
                System.out.println("Conatdo realizado com sucesso. ");
            }
        }while (continuarTentando && tentativasRealizada < 3);{
            if (atendeu){
                System.out.println("Conseguimos contato com: " + candidato + " na " +tentativasRealizada);
            }else{
                System.out.println("Não conseguimos contato com " + candidato + "número maximo de tentativas " + tentativasRealizada);
            }
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Jeff", "Martins", "Mendes", "Vera", "lucia"};
        System.out.println("Imprimindo a lista de candidatos informando o indice dos elementos");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero : " + indice+1 + " é: " + candidatos[indice] );
        }

        System.out.println("Forma abreviado de interação for each");

        for(String candidato : candidatos ){
            System.out.println("o candidato selecionado foi: " + candidato);
        }
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
            candidatoAtual++;
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