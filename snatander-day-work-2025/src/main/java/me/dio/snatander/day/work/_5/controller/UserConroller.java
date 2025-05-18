package me.dio.snatander.day.work._5.controller;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import me.dio.snatander.day.work._5.model.User;
import me.dio.snatander.day.work._5.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping
public class UserConroller {

    private final UserService userService;

    // criando um construutoor que depende do userservice
    public UserConroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}") // expondo um com caminho id
    public ResponseEntity<User> findById(@PathVariable long id){
        var user = userService.findById(id);
        // retorna o usuário completo
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> creat(@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        // retorna o usuário completo
        return ResponseEntity.created(location).body(userCreated);
    }
}
