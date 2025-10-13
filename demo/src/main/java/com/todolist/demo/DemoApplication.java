package com.todolist.demo;

import com.todolist.demo.domain.Todo;
import com.todolist.demo.domain.TodoRepository;
import com.todolist.demo.domain.User;
import com.todolist.demo.domain.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepository, TodoRepository todoRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			User user = new User("user", passwordEncoder.encode("user"),"user");
			userRepository.save(user);

			todoRepository.save(new Todo("스프링부트 프로젝트 만들기", user));
			todoRepository.save(new Todo("리액트 연습하기", user));
		};
	}
}