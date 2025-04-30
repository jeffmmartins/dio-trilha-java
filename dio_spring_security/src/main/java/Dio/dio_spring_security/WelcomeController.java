package Dio.dio_spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping // primeira rota
    public String welcome(){
        return "Welcome to spring boot";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")// tanto o perfil manager e users consegue acessar a rota users
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')") // apenas managers consegue acessar a rota managers
    public String manegers (){
        return "Authorized managers";
    }
}
