package com.sem0504.sem0504.service;

import com.sem0504.sem0504.entity.Status;
import com.sem0504.sem0504.entity.StatusTask;
import com.sem0504.sem0504.repository.StatusRepository;
import com.sem0504.sem0504.repository.StatusTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusTaskService {
    @Autowired
    private StatusTaskRepository statusTaskRepository;

    public List<StatusTask> findAll(){
        return statusTaskRepository.findAll();
    }
    public void create(StatusTask statusTask){
        statusTaskRepository.save(statusTask);
    }
}
