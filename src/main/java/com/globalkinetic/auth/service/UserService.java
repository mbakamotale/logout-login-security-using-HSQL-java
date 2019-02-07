package com.globalkinetic.auth.service;

import com.globalkinetic.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
