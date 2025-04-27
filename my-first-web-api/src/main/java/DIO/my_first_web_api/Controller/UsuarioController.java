package DIO.my_first_web_api.Controller;

import DIO.my_first_web_api.Model.Usuario;
import DIO.my_first_web_api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // todas a srequisições irao iniciar com users
public class UsuarioController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users") // para fazer  a interação para quando pesquisar no localhost ele informa o que tem na regra de negocio
    public List<Usuario>getusers(){
        return  userRepository.findALl();
    }

    @GetMapping("/users/{username}") // ter o parametro na uri.
    public Usuario getOne(@PathVariable("username") String username){
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/users/{id}") // feito a simulação dentro do postman
    public void delete(@PathVariable("id") Integer id){
         userRepository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        userRepository.save(usuario);
    }
}
