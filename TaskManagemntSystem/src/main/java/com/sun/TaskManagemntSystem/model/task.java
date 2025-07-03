package com.sun.TaskManagemntSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Component;

@Entity
@Data
@Table(name="task")
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskID;

    @Column(name = "taskName",nullable = false)
    private String taskName;
    @Column(name = "TaskDetails")
    private String TaskDetails;

    public task(int taskID, String taskName, String taskDetails) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.TaskDetails = taskDetails;
    }

    @Override
    public String toString() {
        return "task{" +
                "taskID=" + taskID +
                ", taskName='" + taskName + '\'' +
                ", TaskDetails='" + TaskDetails + '\'' +
                '}';
    }

    public task() {
    }

    public int getTaskID() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDetails() {
        return TaskDetails;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDetails(String taskDetails) {
        TaskDetails = taskDetails;
    }
}
