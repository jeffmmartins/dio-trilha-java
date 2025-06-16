package Dio_projeto.lab_padroes_projeto_spring.service.impl;

import Dio_projeto.lab_padroes_projeto_spring.model.Cliente;
import Dio_projeto.lab_padroes_projeto_spring.model.ClienteRepository;
import Dio_projeto.lab_padroes_projeto_spring.model.Endereco;
import Dio_projeto.lab_padroes_projeto_spring.model.EnderecoRepository;
import Dio_projeto.lab_padroes_projeto_spring.service.ClienteService;
import Dio_projeto.lab_padroes_projeto_spring.service.ViaCepSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
//exemplo de facade
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepSevice viaCepSevice;

    @Override // buscar cliente no repository
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElse(() -> {
            Endereco novoEndereco = viaCepSevice.consultaCep(cep);
            enderecoRepository.save(novoEndereco);
            return null;
        });
        cliente.setEndereco(endereco);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
