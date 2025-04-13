//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("camila", 123456);
        agendaContatos.adicionarContato("camila", 0);
        agendaContatos.adicionarContato("camila cavaclcante", 11111111);
        agendaContatos.adicionarContato("camila dio", 654987);
        agendaContatos.adicionarContato("maria dio", 654987);

        agendaContatos.exibirContato();

        System.out.println("Contato" + agendaContatos.pesquisarPorNome("camila"));

        System.out.println("Contato atualizada" + agendaContatos.atualizarContato("maria dio", 22222));
    }
}