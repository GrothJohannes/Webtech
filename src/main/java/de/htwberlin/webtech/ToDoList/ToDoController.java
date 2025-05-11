package de.htwberlin.webtech.ToDoList;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {

    @GetMapping
    public List<String> getTodos() {
        return Arrays.asList("Einkaufen", "Hausaufgaben", "Frontend verbinden");
    }
}