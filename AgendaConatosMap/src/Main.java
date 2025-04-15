//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("camila", 123456);
        agendaContatos.adicionarContato("camila", 5665);
        agendaContatos.adicionarContato("camila cavalcante", 1111111);
        agendaContatos.adicionarContato("camila dio", 654987);
        agendaContatos.adicionarContato("maria silva", 1111111);
        agendaContatos.adicionarContato("camila", 4444);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("maria silva");
        agendaContatos.exibirContatos();

    }
}