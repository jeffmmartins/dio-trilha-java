import java.security.SecureRandom;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Craps {
    static final SecureRandom randomNumbers = new SecureRandom();

    // Enum é implicitamente estático quando declarado diretamente na classe
    enum Status { CONTINUE, WON, LOST };

    // Constantes estáticas
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // Classe aninhada estática
    public static class Main {
        public static void main(String[] args) {

            int point = 0;
            Craps.Status gameStatus; // Tipo qualificado está correto

            // Precisa qualificar a chamada do método estático da classe externa
            int sumOfDice = Craps.rollDice();

            switch (sumOfDice) {
                // Precisa qualificar as constantes estáticas da classe externa
                case Craps.SEVEN:       // 7
                case Craps.YO_LEVEN:    // 11
                    // Precisa qualificar as constantes do enum da classe externa
                    gameStatus = Craps.Status.WON;
                    break;
                case Craps.SNAKE_EYES:  // 2
                case Craps.TREY:        // 3
                case Craps.BOX_CARS:    // 12
                    // --- CORREÇÃO LÓGICA IMPORTANTE ---
                    // Na regra do Craps, 2, 3 ou 12 na primeira rolagem é derrota imediata.
                    // O código original definia como CONTINUE e caía no default.
                    gameStatus = Craps.Status.LOST;
                    break; // Adicionado break essencial
                // --- FIM DA CORREÇÃO LÓGICA ---

                default: // 4, 5, 6, 8, 9, 10
                    gameStatus = Craps.Status.CONTINUE;
                    point = sumOfDice;
                    System.out.printf("Point is %d%n", point);
                    break; // Break do default
            }

            // Loop while SÓ executa se o status for CONTINUE
            while (gameStatus == Craps.Status.CONTINUE) { // Qualificar o enum
                sumOfDice = Craps.rollDice(); // Qualificar a chamada
                if (sumOfDice == point) { // Jogador fez o ponto
                    gameStatus = Craps.Status.WON; // Qualificar o enum
                } else if (sumOfDice == Craps.SEVEN) { // Qualificar a constante
                    gameStatus = Craps.Status.LOST; // Qualificar o enum
                }
                // Se não for nenhum dos dois, o loop continua (gameStatus permanece CONTINUE)
            }

            // Imprime o resultado final
            if (gameStatus == Craps.Status.WON) { // Qualificar o enum
                System.out.println("Player wins");
            } else {
                System.out.println("Player loses");
            }
        }
    }

    // Método rollDice permanece como está (é estático em Craps)
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // Convenção: nomes de variáveis minúsculos
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}
