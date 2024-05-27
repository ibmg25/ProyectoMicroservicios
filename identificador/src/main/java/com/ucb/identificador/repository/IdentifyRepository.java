package com.ucb.identificador.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ucb.identificador.model.User;

@Component
public class IdentifyRepository implements iIdentifyRepository {
    List<User> users = new ArrayList<>();
    // users.add(User("1", "a", "aaa"));
}
