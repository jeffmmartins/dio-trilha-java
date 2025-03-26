public abstract class ServicoMensagemInstantanea {


    private void validarConectandoInternet(){
        System.out.println("Conectando Internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Mensagem");
    }

    public abstract void enviarMensagem();
    public abstract void receberMensage();
}
