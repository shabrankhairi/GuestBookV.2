package com.example12345.demo123.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example12345.demo123.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}