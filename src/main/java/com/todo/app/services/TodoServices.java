package com.todo.app.services;

import com.todo.app.model.Todo;
import com.todo.app.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServices {

    @Autowired
    TodoRepository todoRepository;

    public void addTodoDetails(Todo todo){
        todoRepository.save(todo);

    }

}
