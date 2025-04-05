import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
     // atributo
    private List<Tarefas> tarefaList;

    // construtor, sempre que criar objeto listatarefa vai ter um array
    // list vazio.
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
    }

    public int obterNumeroTarefas () {
        // retorna o tamanho do list
        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }
}