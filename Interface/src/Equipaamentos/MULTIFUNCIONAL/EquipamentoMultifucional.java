package Equipaamentos.MULTIFUNCIONAL;

import Equipaamentos.copiaaadora.Copiadora;
import Equipaamentos.digitaalizadora.Digitalizadora;
import Equipaamentos.impressora.Impressora;

public class EquipamentoMultifucional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMEENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizaar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMEENTO MULTIFUNCIONAL");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMEENTO MULTIFUNCIONAL");
    }
}
