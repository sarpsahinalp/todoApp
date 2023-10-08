package com.todo.todoserver.service;

import com.todo.todoserver.model.ToDoElement;
import com.todo.todoserver.repository.ToDoElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoElementServiceImpl implements ToDoElementService{

    private final ToDoElementRepository toDoElementRepository;

    @Autowired
    public ToDoElementServiceImpl(ToDoElementRepository toDoElementRepository) {
        this.toDoElementRepository = toDoElementRepository;
    }

    @Override
    public ToDoElement save(ToDoElement toDoElement) {
        return toDoElementRepository.save(toDoElement);
    }

    @Override
    public List<ToDoElement> findAll() {
        return null;
    }

    @Override
    public ToDoElement update(ToDoElement toDoElement) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
