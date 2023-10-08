package com.todo.todoserver.repository;

import com.todo.todoserver.model.ToDoElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoElementRepository extends JpaRepository<ToDoElement, Long> {
}
