package Entities;

public class ContaTerminal{
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(){

    }

    public ContaTerminal(int número, String agencia, String nomeCliente, Double saldo) {
        this.numero = número;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNúmero() {
        return numero;
    }

    public void setNúmero(int número) {
        this.numero = número;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "Olá " + nomeCliente +
                " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", sua conta é: " + numero + " e seu saldo é: " + saldo + " já está disponivel para saque.";
    }
}
