package com.sem0504.sem0504.service;

import com.sem0504.sem0504.entity.Role;
import com.sem0504.sem0504.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll(){
        return roleRepository.findAll();
    }
    public void create(Role role){
        roleRepository.save(role);
    }
}
