public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        // encapsulando metodos
        validarConectandoInternet();
        System.out.println("Enviado mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensage(){
        System.out.println("Recebendo mensageem");
    }

    private void validarConectandoInternet(){
        System.out.println("Conectando Internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Mensagem");
    }
}
