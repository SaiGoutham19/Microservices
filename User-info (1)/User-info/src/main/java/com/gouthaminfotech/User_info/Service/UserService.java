package com.gouthaminfotech.User_info.Service;

import com.gouthaminfotech.User_info.Entity.Userinfo;
import com.gouthaminfotech.User_info.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


import java.util.List;
@Service

public class UserService {
    @Autowired

    private UserRepo repo;

    public Userinfo addUsers(Userinfo userinfo) {
        return repo.save(userinfo);
    }

    public List<Userinfo> getAllUsers() {
        return repo.findAll();
    }

    public List<Userinfo> getUserByJobid(Long jobid) {
        return repo.findByJobid(jobid);
    }
}
