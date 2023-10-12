package com.example.password.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.password.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
