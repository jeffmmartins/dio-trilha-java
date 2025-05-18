package me.dio.snatander.day.work._5.service;

import me.dio.snatander.day.work._5.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
