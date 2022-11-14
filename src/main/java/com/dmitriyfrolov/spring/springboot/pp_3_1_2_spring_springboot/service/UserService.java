package com.dmitriyfrolov.spring.springboot.pp_3_1_2_spring_springboot.service;

import com.dmitriyfrolov.spring.springboot.pp_3_1_2_spring_springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User show(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
