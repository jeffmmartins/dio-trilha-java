package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validandoInternet();
        System.out.println("Enviando mensagem msn");
    }

    @Override
    public void receberMensage() {
        System.out.println("Recebendo mensagem msn");
    }
}