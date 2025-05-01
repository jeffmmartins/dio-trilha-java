/*
 * Singleton "preguiçoso"
 *@Author Jeff
 */

public class SingletonEager {
    // não disponibiliza uma instacia para o usuário.
    //criando uuma instancia dele mesmo.
    private static SingletonEager instancia = new SingletonEager();

    // garantindo que nao seja instanciado externamente.
    private SingletonEager() {
        super();
    }
    //  grantinddo que a instancia seja exposta para quem está chamando

    public static SingletonEager getInstance(){
        return instancia;
    }
}
