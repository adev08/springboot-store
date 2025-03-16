package com.springboottoturial.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboottoturial.store.entities.User;
import com.springboottoturial.store.services.UserService;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StoreApplication.class, args);
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var userService =  context.getBean(UserService.class);
		userService.registerUser(new User(1L, "Alex", "alex@codewithalex.com", "Password"));
		userService.registerUser(new User(1L, "Alex", "alex@codewithalex.com", "Password"));

	}

}
