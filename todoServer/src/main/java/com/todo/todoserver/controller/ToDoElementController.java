package com.todo.todoserver.controller;

import com.todo.todoserver.model.ToDoElement;
import com.todo.todoserver.service.ToDoElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoElementController {

    private final ToDoElementService toDoElementService;

    @Autowired
    public ToDoElementController(ToDoElementService toDoElementService) {
        this.toDoElementService = toDoElementService;
    }

    @GetMapping("/todo")
    public Iterable<ToDoElement> getToDoElements() {
        return toDoElementService.findAll();
    }

}
