package DIO.my_first_web_api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String welcomw(){
        return "Welcome to My Spring Boot Web API";
    }
}
