package com.example.pp_3_1_1_boot.service;

import com.example.pp_3_1_1_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> index();
    void save(User user);
    User getUser(long id);
    void update(User user);
    void delete(long id);
}
