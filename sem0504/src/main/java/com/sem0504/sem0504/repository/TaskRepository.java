package com.sem0504.sem0504.repository;


import com.sem0504.sem0504.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
