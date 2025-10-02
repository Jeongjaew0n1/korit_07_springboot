package com.example.todolist.web;

import com.example.todolist.domain.Todo;
import com.example.todolist.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todos/{id}")
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping("/todos/{id}")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        Todo savedTodo = todoService.addTodo(todo);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @DeleteMapping("/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        if (todoService.deleteTodo(id)) {
            return ResponseEntity.noContent().build();  // 삭제 성공시 204 No Content return
        }
        return ResponseEntity.notFound().build();       // 대상이 없으면 404 Not Found
    }

    @PutMapping("/api/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
        return todoService.updateTodo(id, todoDetails)
                .map(updateTodo -> ResponseEntity.ok().body(updateTodo)) // 수정 성공 시에는 200 OK
                .orElse(ResponseEntity.notFound().build());
    }

    // 할일 완료 상태 변경
    @PatchMapping("/api/todos/{id}")
    public ResponseEntity<Todo> ToggleStatus(@PathVariable Long id) {
        return todoService.updateTodoStatus(id)
                .map(todo -> ResponseEntity.ok(todo))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

//    @DeleteMapping("/api/todos/completed")
//    public ResponseEntity<Void> clearCompletedTodos(@PathVariable Long id) {
//        if ()
//        return ResponseEntity.noContent().build();
//    }

}