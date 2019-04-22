package com.example12345.demo123.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example12345.demo123.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer> {

}