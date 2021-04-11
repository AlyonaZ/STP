package com.sem0504.sem0504.service;

import com.sem0504.sem0504.entity.Task;
import com.sem0504.sem0504.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll(){
        return taskRepository.findAll();
    }
    public void create(Task task){
        taskRepository.save(task);
    }
}
