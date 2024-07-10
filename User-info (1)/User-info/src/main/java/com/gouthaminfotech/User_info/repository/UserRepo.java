package com.gouthaminfotech.User_info.repository;

import com.gouthaminfotech.User_info.Entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<Userinfo, Integer> {
    List<Userinfo> findByJobid(Long jobid);
}
