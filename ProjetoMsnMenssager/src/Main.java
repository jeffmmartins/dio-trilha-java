//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensage();

        Facebook mensagem = new Facebook();
        mensagem.enviarMensagem();
        mensagem.receberMensage();

        Telegram texto = new Telegram();
        texto.enviarMensagem();
        texto.receberMensage();
    }
}