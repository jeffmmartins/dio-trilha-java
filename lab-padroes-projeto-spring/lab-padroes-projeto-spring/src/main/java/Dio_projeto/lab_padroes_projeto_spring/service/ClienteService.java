package Dio_projeto.lab_padroes_projeto_spring.service;

import Dio_projeto.lab_padroes_projeto_spring.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    Iterable <Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
