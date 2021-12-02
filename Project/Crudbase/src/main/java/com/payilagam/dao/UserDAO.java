package com.payilagam.dao;

import org.springframework.data.repository.CrudRepository;

import com.payilagam.User;

public interface UserDAO extends CrudRepository<User, Integer> {
//crud operations - create update delete
}
