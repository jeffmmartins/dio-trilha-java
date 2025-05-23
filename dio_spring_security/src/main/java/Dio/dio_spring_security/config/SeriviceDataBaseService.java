package Dio.dio_spring_security.config;

import Dio.dio_spring_security.model.User;
import Dio.dio_spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SeriviceDataBaseService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override

    // O Spring chama esse método automaticamente quando alguém tenta fazer login
    //esse metodo é uma interface do UserDetailsService
    //carregar os dados de um usuário do banco de dados, com base no nome de usuário (username), na hora do login.
    public UserDetails loadUserByUsername(String username) {
        User userEntity = userRepository.findByUsername(username);
        if (userEntity == null) {
            ///lança uma exceção
            throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        userEntity.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        });
        UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getUsername(),
                userEntity.getPassword(),
                authorities);
        return user;
    }
}
