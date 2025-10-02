package com.example.todolist.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    private boolean isCompleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private AppUser appUser;

    public Todo(String content, boolean isCompleted, AppUser appUser) {
        this.content = content;
        this.isCompleted = isCompleted;
        this.appUser = appUser;
    }
}
