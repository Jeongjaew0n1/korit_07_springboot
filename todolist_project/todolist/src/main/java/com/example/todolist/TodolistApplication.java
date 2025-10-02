package com.example.todolist;

import com.example.todolist.domain.AppUser;
import com.example.todolist.domain.AppUserRepository;
import com.example.todolist.domain.Todo;
import com.example.todolist.domain.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(
			TodolistApplication.class
	);

	private final AppUserRepository appUserRepository;
	private final TodoRepository todoRepository;
	private final PasswordEncoder passwordEncoder;

	public TodolistApplication(AppUserRepository appUserRepository, TodoRepository todoRepository, PasswordEncoder passwordEncoder) {
		this.appUserRepository = appUserRepository;
		this.todoRepository = todoRepository;
        this.passwordEncoder = passwordEncoder;
    }

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AppUser user = new AppUser("user", "$2a$12$My8ZCNo4MDTf9bXHeTvj6.khpWReSs5TgcLpOmLggt/erNLjB6EEC", "USER");
		appUserRepository.save(user);

		AppUser admin = new AppUser("admin", "$2a$12$L1syZhZVJ94gi58KaOU8/uL9V3WCcIiFplH.nH8XCY4AlIIwGKpEO", "ADMIN");
		appUserRepository.save(admin);

		Todo todo1 = new Todo("자바 공부하기", false, user);
		todoRepository.save(todo1);

		Todo todo2 = new Todo("파이썬 공부하기", false, user);
		todoRepository.save(todo2);

	}
}
