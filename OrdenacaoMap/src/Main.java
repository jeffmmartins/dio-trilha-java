import java.time.LocalDate;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();


        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), evento1, atracao1);
    }
}