package com.ucb.usuario;

public class UserService {
    IUserRepository iUserRepository;
    public UserService(IUserRepository iUserRepository){
        this.iUserRepository = iUserRepository;
    }

    public User getUser(String id){
        return this.iUserRepository.getUser(id);
    }
}
