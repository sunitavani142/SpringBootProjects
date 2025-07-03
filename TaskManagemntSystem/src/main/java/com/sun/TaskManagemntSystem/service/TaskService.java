package com.sun.TaskManagemntSystem.service;

import com.sun.TaskManagemntSystem.model.task;
import com.sun.TaskManagemntSystem.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService
{
@Autowired
TaskRepo repo;
public List<task> getAllTasks()
{
    return repo.findAll();
}
public  task getTaskbyID(int id)
{
    return repo.findById(id).orElse(new task());
}
public void addTask(task tsk)
{
    System.out.println("Task received is");
    System.out.println(tsk);
    repo.save(tsk);

}
    public void updateTask(task tk)
    {
        repo.save(tk);
    }
    public void deleteTask(int tskid)
    {
        repo.deleteById (tskid);
    }


}
