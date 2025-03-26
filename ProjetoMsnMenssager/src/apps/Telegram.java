package apps;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validandoInternet();
        System.out.println("Enviando mensagem apps.Telegram");
    }

    @Override
    public void receberMensage() {
        System.out.println("Recebendo mensagem apps.Telegram");
    }
}
