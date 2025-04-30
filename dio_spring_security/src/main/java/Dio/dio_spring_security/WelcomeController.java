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
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    public String manegers (){
        return "Authorized managers";
    }
}
