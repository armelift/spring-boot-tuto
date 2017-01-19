package com.armelift.services;

import java.util.Collection;
import java.util.Optional;

import com.armelift.domains.User;
import com.armelift.domains.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
