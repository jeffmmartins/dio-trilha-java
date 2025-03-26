import javax.sound.midi.Soundbank;

public class MSNMessenger extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem msn");
    }

    @Override
    public void receberMensage() {
        System.out.println("Recebendo mensagem msn");
    }
}