//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Total de tarefas adicionadas: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");

        System.out.println("Total de tarefas adicionadas: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("Total de tarefas adicionadas: " + listaTarefa.obterNumeroTarefas());
        listaTarefa.obterDescricaoTarefa();
    }
}