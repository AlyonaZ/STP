package com.sem0504.sem0504.service;

import com.sem0504.sem0504.entity.Role;
import com.sem0504.sem0504.entity.User;
import com.sem0504.sem0504.repository.RoleRepository;
import com.sem0504.sem0504.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public void create(User user){
        userRepository.save(user);
    }
}
