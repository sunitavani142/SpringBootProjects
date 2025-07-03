package com.sun.TaskManagemntSystem.controller;

import com.sun.TaskManagemntSystem.model.task;
import com.sun.TaskManagemntSystem.service.TaskService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService service;
    @RequestMapping("/")
    public String Greet()
    {
        return "Welcome to task management system..";
    }
    @GetMapping("/tasks")
    //public List<task> getAllTasks()
    public ResponseEntity <List<task>> getAllTasks()
    {
        //return service.getAllTasks();
        return new ResponseEntity<>(service.getAllTasks(), HttpStatus.OK);
    }
    @GetMapping("/tasks/{id}")
   // public task getTask(@PathVariable int id)
    public ResponseEntity <task> getTask(@PathVariable int id)
    {
        task tk=service.getTaskbyID(id);
        if(tk!=null)
            return new ResponseEntity<> (service.getTaskbyID(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/tasks")
    public void addTask(@RequestBody task tk)
    {
        System.out.println(tk);
        service.addTask(tk);
    }

    @PutMapping("/tasks")
    public void updateTask(@RequestBody task  tsk)
    {
        service.updateTask(tsk);
    }
    @DeleteMapping("/tasks/{tkId}")
    public void deleteTask(@PathVariable int tkId)
    {
        service.deleteTask(tkId);


    }


}
