package entities;

public abstract class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;

    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void despositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.despositar(valor);
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

    protected void imprimirInformaçõesComun(){
        System.out.println(String.format("Agência: %d ", agencia));
        System.out.println(String.format("Conta: %d ", conta));
        System.out.println(String.format("Saldo: %.2f ", saldo));
    }
}
