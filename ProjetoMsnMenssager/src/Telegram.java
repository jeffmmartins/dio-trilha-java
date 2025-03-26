public class Telegram extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem Telegram");
    }

    @Override
    public void receberMensage() {
        System.out.println("Recebendo mensagem Telegram");
    }
}
