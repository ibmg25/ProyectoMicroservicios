package com.ucb.identificador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ucb.identificador.dto.UserDto;

@RestController
public class IdentifyController {
    @GetMapping("/identify")
    public String identify(){
        return "prueba identificador";
    }

    @GetMapping("/identify/{ci}")
    public ResponseEntity<UserDto> obtain(@PathVariable String ci) {
        UserDto user = new UserDto("1", "Juan", "01/01/2000");
        return ResponseEntity.ok(user);
    }
}
