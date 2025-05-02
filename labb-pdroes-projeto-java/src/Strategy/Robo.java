package Strategy;

public class Robo {
    //atribuição do tipo comportamento que é a interface que é a strategy .
    private Comportamento comportamento;

    //  Esse método permite injetar a estratégia desejada
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
