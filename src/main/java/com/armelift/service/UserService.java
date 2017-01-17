package com.armelift.service;

import java.util.Collection;
import java.util.Optional;

import com.armelift.domain.User;
import com.armelift.domain.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
