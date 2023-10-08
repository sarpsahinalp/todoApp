package com.todo.todoserver.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class ToDoElement {
    @Id
    @SequenceGenerator(
            name = "todo_element_sequence",
            sequenceName = "todo_element_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todo_element_sequence"
    )
    private Long id;
    private String title;
    private String description;
    private boolean done;
    private Date toDoDate;
    private int priority;
}
