import Facade.Facade;
import Strategy.COmportamentoDefensivo;
import Strategy.ComportamentoAgressiivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Acessando pela classe
        SingletonLazy  singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();

        //STRATEGY

        ComportamentoNormal comportamentoNormal = new ComportamentoNormal();
        ComportamentoAgressiivo comportamentoAgressiivo = new ComportamentoAgressiivo();
        COmportamentoDefensivo comportamentoDefensivo = new COmportamentoDefensivo();

        Robo robo = new Robo();

        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.setComportamento(comportamentoAgressiivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Jeff", "61920160");


    }
}