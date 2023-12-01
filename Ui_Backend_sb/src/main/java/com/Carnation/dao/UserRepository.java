package com.Carnation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Carnation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
