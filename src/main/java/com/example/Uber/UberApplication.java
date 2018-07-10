package com.example.Uber;

import com.example.Uber.Repository.UserRepository;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Iterator;

@SpringBootApplication
public class UberApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UberApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
		if (userRepository.count()==0){
			User user = new User();
			user.setUsername("admin");
			user.setPassword(encoder.encode("admin"));
			userRepository.save(user);
		}
	}
}