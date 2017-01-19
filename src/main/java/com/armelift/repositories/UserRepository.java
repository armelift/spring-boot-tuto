package com.armelift.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.armelift.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
}