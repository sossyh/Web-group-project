package com.Group11.Mekinaye.security;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository 
extends CrudRepository<User, Long> {
   public User findByUsername(String username);
}

