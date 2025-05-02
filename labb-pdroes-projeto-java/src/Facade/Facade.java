package Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

import java.lang.classfile.ClassElement;

//Utilizado com integração de subsistema externo.
public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
