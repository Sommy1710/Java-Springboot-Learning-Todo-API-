
package com.example.todoapi.controller;

import com.example.todoapi.dto.TodoRequest;
import com.example.todoapi.dto.TodoResponse;
import com.example.todoapi.service.TodoService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // CREATE TODO
    @PostMapping
    public ResponseEntity<TodoResponse> createTodo(
            @Valid @RequestBody TodoRequest request
    ) {

        TodoResponse response =
                todoService.createTodo(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    // GET ALL TODOS
    @GetMapping
    public ResponseEntity<List<TodoResponse>> getAllTodos() {

        List<TodoResponse> todos =
                todoService.getAllTodos();

        return ResponseEntity.ok(todos);
    }

    // GET TODO BY ID
    @GetMapping("/{id}")
    public ResponseEntity<TodoResponse> getTodoById(
            @PathVariable Long id
    ) {

        TodoResponse todo =
                todoService.getTodoById(id);

        return ResponseEntity.ok(todo);
    }

    // UPDATE TODO
    @PutMapping("/{id}")
    public ResponseEntity<TodoResponse> updateTodo(
            @PathVariable Long id,
            @Valid @RequestBody TodoRequest request
    ) {

        TodoResponse updatedTodo =
                todoService.updateTodo(id, request);

        return ResponseEntity.ok(updatedTodo);
    }

    // DELETE TODO
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(
            @PathVariable Long id
    ) {

        todoService.deleteTodo(id);

        return ResponseEntity.noContent().build();
    }
}