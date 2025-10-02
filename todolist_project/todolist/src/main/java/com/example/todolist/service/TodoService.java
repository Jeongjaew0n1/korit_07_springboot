package com.example.todolist.service;

import com.example.todolist.domain.Todo;
import com.example.todolist.domain.TodoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // 모든 할일 목록을 조회
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    // 새로운 할일 저장
    public Todo addTodo(Todo todo){
        return todoRepository.save(todo);
    }

    // 할일 하나 조회
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // 할일 하나 삭제
    public boolean deleteTodo(Long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // 할일 수정
    @Transactional
    public Optional<Todo> updateTodo(Long id, Todo todoDetails) {
        return todoRepository.findById(id)
                .map(todo -> {
                    todo.setId(todoDetails.getId());
                    todo.setContent(todoDetails.getContent());
                    todo.setAppUser(todoDetails.getAppUser());
                    todo.setCompleted(todoDetails.isCompleted());
                    return todo;
                });
    }

    // 완료 상태 변경
    @Transactional
    public Optional<Todo> updateTodoStatus(Long id) {
        return todoRepository.findById(id)
                .map(todo -> {
                    todo.setCompleted(!todo.isCompleted());
                    return todoRepository.save(todo);
                });
    }

}
