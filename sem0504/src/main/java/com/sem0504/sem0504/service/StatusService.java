package com.sem0504.sem0504.service;

import com.sem0504.sem0504.entity.Role;
import com.sem0504.sem0504.entity.Status;
import com.sem0504.sem0504.repository.RoleRepository;
import com.sem0504.sem0504.repository.StatusRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusService {
    @Autowired
    private StatusRepository statusRepository;

    public List<Status> findAll(){
        return statusRepository.findAll();
    }
    public void create(Status status){
        statusRepository.save(status);
    }
}
