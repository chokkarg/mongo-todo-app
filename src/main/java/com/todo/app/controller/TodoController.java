package com.todo.app.controller;

import com.todo.app.model.Todo;
import com.todo.app.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    TodoServices todoServices;

    @PostMapping("/add")
    public void addTodoapp(@RequestBody Todo todo){

        todoServices.addTodoDetails(todo);
    }

}
