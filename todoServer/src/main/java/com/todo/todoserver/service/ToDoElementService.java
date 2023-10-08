package com.todo.todoserver.service;

import com.todo.todoserver.model.ToDoElement;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ToDoElementService {

    ToDoElement save(ToDoElement toDoElement);

    List<ToDoElement> findAll();

    ToDoElement update(ToDoElement toDoElement);

    void delete(Long id);
}
