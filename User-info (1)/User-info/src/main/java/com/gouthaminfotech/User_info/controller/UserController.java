package com.gouthaminfotech.User_info.controller;


import com.gouthaminfotech.User_info.Entity.Userinfo;
import com.gouthaminfotech.User_info.Service.UserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addusers")
    public Userinfo addUser(@RequestBody Userinfo userinfo){
        return userService.addUsers(userinfo);
    }

    @GetMapping("/users")
    public List<Userinfo> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("job/{jobid}")
    public ResponseEntity<List<Userinfo>>getusersByJobid(@PathVariable("jobid") Long jobid){
        List<Userinfo> users = userService.getUserByJobid(jobid);
        if(users.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);

    }

}