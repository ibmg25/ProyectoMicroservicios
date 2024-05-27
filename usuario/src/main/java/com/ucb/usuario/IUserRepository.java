package com.ucb.usuario;

import java.util.ArrayList;

public interface IUserRepository {
    public User getUser(String id);
    public User createUser(User user);
    public User deleteUser(String id);
    public ArrayList<User> listUser();    
} 