package com.example.todolist.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    void deleteByAppUser_IdAndIsCompletedTrue(Long userId);
}
