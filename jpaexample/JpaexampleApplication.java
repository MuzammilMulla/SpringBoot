package com.jpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpaexample.dao.UserRepository;
import com.jpaexample.entities.User;

@SpringBootApplication
public class JpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(JpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		
		user.setName("Muzammil");
		user.setCity("Belgaum");
		user.setGender("Male");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
			
		
	}

}
