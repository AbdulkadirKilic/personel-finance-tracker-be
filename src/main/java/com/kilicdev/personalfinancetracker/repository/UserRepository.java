package com.kilicdev.personalfinancetracker.repository;

import com.kilicdev.personalfinancetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
