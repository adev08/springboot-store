package com.springboottoturial.store.repositories;

import com.springboottoturial.store.entities.User;

//@Repository
public interface UserRepository  {

    void save(User user);
    User findByEmail(String email);
    
}
