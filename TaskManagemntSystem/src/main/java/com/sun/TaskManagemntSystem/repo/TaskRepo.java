package com.sun.TaskManagemntSystem.repo;

import com.sun.TaskManagemntSystem.model.task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<task, Integer> {
}
