package com.gouthaminfotech.Jobs_info.config;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userinfo {
    @Id
    public int id;
    public String name;
    public  String username;
    public String email;
    public String phone;
    public Date dob;
    public String password;
    public String experience;
    public String domain;
    public String designation;
    public String company;
    public String address;
    public String city;
    public String state;
    public String country;
    public List<String> skills;
    public long jobId;
}
