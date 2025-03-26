package apps;

public class Facebook extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validandoInternet();
        System.out.println("Enviando mensagem facebook");
    }

    @Override
    public void receberMensage() {
        System.out.println("Recebendo mensagem facebook");
    }
}
