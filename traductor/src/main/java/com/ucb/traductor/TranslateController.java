package com.ucb.traductor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ucb.traductor.dto.TranslateDto;

@RestController
public class TranslateController {
    @PostMapping("/translate")
    public ResponseEntity translate(@RequestBody TranslateDto translateDto) {
        return ResponseEntity.ok("Hola a todos");
    }
}
