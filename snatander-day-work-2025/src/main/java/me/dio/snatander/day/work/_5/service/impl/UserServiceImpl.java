package me.dio.snatander.day.work._5.service.impl;

import me.dio.snatander.day.work._5.model.User;
import me.dio.snatander.day.work._5.repository.UserRepository;
import me.dio.snatander.day.work._5.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service //indicando que vai ser nossa camada de negocio
public class UserServiceImpl implements UserService {

    // para criar esse serviço , espring entená que é necessario injetar o userRepository;
    private final UserRepository userRepository;// interface de acesso a dados

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        //caso não encontre o id ele lança um exceção.
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        // usuário for  diferente de null e identificar que o usuário já existe, lança uma exceção;
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Nuumber  already exist.");
        }
        //salvar no userrepository, salva ou atualiza o objetono banco via JPA
        return userRepository.save(userToCreate);
    }
}
