package entities;

public interface IConta {
    //Todos os metodos de uma interface é público
    default void sacar(double valor){}

    default void despositar(double valor){}

    default void transferir(double valor, Conta contaDestino){}
}
