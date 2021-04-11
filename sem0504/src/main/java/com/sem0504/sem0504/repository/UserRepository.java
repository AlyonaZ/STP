package com.sem0504.sem0504.repository;

import com.sem0504.sem0504.entity.Role;
import com.sem0504.sem0504.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
