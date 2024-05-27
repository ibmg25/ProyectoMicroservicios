package com.ucb.identificador;

import org.springframework.http.ResponseEntity;

import com.ucb.identificador.dto.UserDto;

public interface iIdentifyApi {
    String identify();

    public ResponseEntity<UserDto> obtain(String ci);
}
