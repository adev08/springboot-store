package com.springboottoturial.store.services;

import org.springframework.stereotype.Service;

import com.springboottoturial.store.entities.User;
import com.springboottoturial.store.repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }


    public void registerUser(User user) {
      if(userRepository.findByEmail(user.getEmail()) != null) {
        throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");
      }

      userRepository.save(user);
      notificationService.send("You registered successfully", user.getEmail());
    }
    
}
