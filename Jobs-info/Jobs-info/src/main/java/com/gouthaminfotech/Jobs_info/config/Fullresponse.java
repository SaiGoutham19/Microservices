package com.gouthaminfotech.Jobs_info.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fullresponse {

    public long jobid;
    public String jobtitle;
    public String jobdescription;
    public String joblocation;
    public String jobtype;
    public String jobcategory;
    public String salary;
    public String experience;
    public List<Userinfo> userinfos;

}
