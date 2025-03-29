package Estaabelecimento;

import Equipaamentos.impressora.Deskjet;
import Equipaamentos.impressora.Impressora;
import Equipaamentos.impressora.LaserJet;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        Impressora impressora2 = new LaserJet();

        impressora.imprimir();
        impressora2.imprimir();
    }
}
