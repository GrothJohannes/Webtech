package de.htwberlin.webtech.ToDoList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @GetMapping("/todos")
    public List<ToDo> testRoute() {
        return List.of(
                new ToDo("Test Todo 1", "This is a test todo item 1."),
                new ToDo("Test Todo 2", "This is a test todo item 2."),
                new ToDo("Test Todo 3", "This is a test todo item 3.")
        );
    }
}
