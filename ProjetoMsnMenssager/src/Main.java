import apps.Facebook;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appescolhido = "tlg";

        if (appescolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appescolhido.equals("tlg")) {
            smi = new Telegram();
        } else if (appescolhido.equals("faceebook"))
            smi = new Facebook();

        smi.enviarMensagem();
        smi.receberMensage();

    }
}