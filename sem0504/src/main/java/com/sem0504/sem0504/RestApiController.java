package com.sem0504.sem0504;

import com.sem0504.sem0504.entity.*;
import com.sem0504.sem0504.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RestApiController {
    private final RoleService roleService;
    private final StatusService statusService;
    private final StatusTaskService statusTaskService;
    private final TaskService taskService;
    private final UserService userService;
    @Autowired
    public RestApiController(RoleService roleService, StatusService statusService, StatusTaskService statusTaskService, TaskService taskService, UserService userService){
        this.roleService = roleService;
        this.statusService = statusService;
        this.statusTaskService = statusTaskService;
        this.taskService = taskService;
        this.userService = userService;
    }
    @PostMapping(value="/api/role")
    private ResponseEntity<?> create(@RequestBody Role role){
        roleService.create(role);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value="/api/role")
    private ResponseEntity<List<Role>> readRole(){
        final List<Role> roleList = roleService.findAll();
        return roleList != null && !roleList.isEmpty()
                ? new ResponseEntity<>(roleList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="/api/status")
    private ResponseEntity<?> create(@RequestBody Status status){
        statusService.create(status);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value="/api/status")
    private ResponseEntity<List<Status>> readStatus(){
        final List<Status> statusList = statusService.findAll();
        return statusList != null && !statusList.isEmpty()
                ? new ResponseEntity<>(statusList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="/api/statusTask")
    private ResponseEntity<?> create(@RequestBody StatusTask statusTask){
        statusTaskService.create(statusTask);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value="/api/statusTask")
    private ResponseEntity<List<StatusTask>> readStatusTask(){
        final List<StatusTask> statusTaskList = statusTaskService.findAll();
        return statusTaskList != null && !statusTaskList.isEmpty()
                ? new ResponseEntity<>(statusTaskList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/api/task")
    private ResponseEntity<?> create(@RequestBody Task task){
        taskService.create(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value="/api/task")
    private ResponseEntity<List<Task>> readTask(){
        final List<Task> taskList = taskService.findAll();
        return taskList != null && !taskList.isEmpty()
                ? new ResponseEntity<>(taskList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value="/api/user")
    private ResponseEntity<?> create(@RequestBody User user){
        userService.create(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping(value="/api/user")
    private ResponseEntity<List<User>> readUser(){
        final List<User> userList = userService.findAll();
        return userList != null && !userList.isEmpty()
                ? new ResponseEntity<>(userList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
