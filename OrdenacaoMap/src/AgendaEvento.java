import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    // atributo
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento (LocalDate data, String nome, String atracao){
        // intanciado Evento
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate,Evento> entry : eventoMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento : " + entry.getValue() + " acontecera na proxima " + entry.getKey());
                break;
            }
        }
    }
}
