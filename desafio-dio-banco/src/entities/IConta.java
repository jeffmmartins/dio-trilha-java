package entities;

public interface IConta {
    //Todos os metodos de uma interface é público
    default void sacar(){}

    default void despositar(){}

    default void transferir(){}
}
