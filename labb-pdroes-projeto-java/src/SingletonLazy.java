/*
* Singleton "preguiçoso"
*@Author Jeff
 */

public class SingletonLazy {
    // não disponibiliza uma instacia para o usuário.
    //criando uuma instancia dele mesmo.
    private static SingletonLazy instancia;
    // garantindo que nao seja instanciado externamente.
    private SingletonLazy() {
        super();
    }
    //  grantinddo que a instancia seja exposta para quem está chamando

    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
