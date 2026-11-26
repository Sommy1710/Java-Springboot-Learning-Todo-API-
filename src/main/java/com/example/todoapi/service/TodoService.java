package com.example.todoapi.service;

import com.example.todoapi.dto.TodoRequest;
import com.example.todoapi.dto.TodoResponse;
import com.example.todoapi.entity.Todo;
import com.example.todoapi.exception.ResourceNotFoundException;
import com.example.todoapi.repository.TodoRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // convert entity to response DTO
    private TodoResponse toResponse(Todo todo) {
        return new TodoResponse(
            todo.getId(),
            todo.getTitle(),
            todo.getDescription(),
            todo.isCompleted(),
            todo.getCreatedAt(),
            todo.getUpdatedAt()
        );
    }

    // CREATE
    public TodoResponse createTodo(TodoRequest request) {
        Todo todo = new Todo();

        todo.setTitle(request.title());
        todo.setDescription(request.description());
        todo.setCompleted(request.completed());

        Todo savedTodo = todoRepository.save(todo);

        return toResponse(savedTodo);
    }

    //Get all
    public List<TodoResponse> getAllTodos() {
        return todoRepository.findAll()
        .stream()
        .map(this::toResponse)
        .toList();
    }

    //get one
    public TodoResponse getTodoById(Long id) {
        Todo todo = todoRepository.findById(id)
        .orElseThrow(() -> 
        new ResourceNotFoundException(
            "todo not found with ID: " + id
        ));
        return toResponse(todo);
    }

    //update
    @Transactional
    public TodoResponse updateTodo(
        Long id,
        TodoRequest request
    ) {
        Todo todo = todoRepository.findById(id)
        .orElseThrow(() -> 
        new ResourceNotFoundException(
            "todo not found with ID:" + id
        ));
        todo.setTitle(request.title());
        todo.setDescription(request.description());
        todo.setCompleted(request.completed());

        return toResponse(todo);
    }

    //delete
    public void deleteTodo(Long id) {
        Todo todo = todoRepository.findById(id)
        .orElseThrow(() ->
        new ResourceNotFoundException(
            "todo not found with ID:" + id
        ));
        todoRepository.delete(todo);
    }
}