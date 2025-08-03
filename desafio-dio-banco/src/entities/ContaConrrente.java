package entities;

public class ContaConrrente extends Conta {


    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        imprimirInformaçõesComun();
    }
}
