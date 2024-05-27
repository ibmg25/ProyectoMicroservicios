package com.ucb.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ucb.usuario.dto.UserDto;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable String id) {
        UserDto user = new UserDto(id, "Usuario " + id);
        return user;
    }
}
