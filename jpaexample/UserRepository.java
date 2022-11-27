package com.jpaexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpaexample.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
