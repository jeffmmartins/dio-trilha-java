package entities;

public abstract class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;

    }

    public void sacar(double valor){

    }

    public void despositar(double valor){
        saldo += valor;
    }

    public void transferir(){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
