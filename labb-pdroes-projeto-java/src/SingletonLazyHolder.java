/*
 * Singleton "preguiçoso"
 *@Author Jeff
 */
public class SingletonLazyHolder {

    // não disponibiliza uma instacia para o usuário.
    //criando uuma instancia dele mesmo.
    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // garantindo que nao seja instanciado externamente.
    private SingletonLazyHolder() {
        super();
    }
    //  grantinddo que a instancia seja exposta para quem está chamando

    public static SingletonLazyHolder getInstance(){
        return Holder.instancia;
    }
}
