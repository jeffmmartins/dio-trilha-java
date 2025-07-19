package entities;

public abstract class Conta implements IConta {
    private int agencia;
    private int conta;
    private double saldo;

    public void sacar(){

    }

    public void despositar(){

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
