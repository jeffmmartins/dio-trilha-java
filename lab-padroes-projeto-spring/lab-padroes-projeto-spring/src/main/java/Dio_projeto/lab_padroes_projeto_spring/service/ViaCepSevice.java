package Dio_projeto.lab_padroes_projeto_spring.service;

import Dio_projeto.lab_padroes_projeto_spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep",url = "https://viacep.com.br/ws")
public interface ViaCepSevice {
    @RequestMapping(method = RequestMethod.GET,value = "/{cep}/json")
    Endereco consultaCep(@PathVariable("cep") String cep);
}
