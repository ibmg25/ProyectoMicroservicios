package com.ucb.usuario;

import com.ucb.usuario.dto.UserDto;

public interface IUserApi {
    UserDto getUserById(String userId);
}
