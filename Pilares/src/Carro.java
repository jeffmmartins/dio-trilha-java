//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Carro {
    public static void main(String[] args) {
        Autodromo jeep = new Autodromo();
        jeep.setChassi("12345");
        jeep.ligar();

        MOto z400 = new MOto();
        z400.setChassi("22222");
        z400.ligar();

    }
}