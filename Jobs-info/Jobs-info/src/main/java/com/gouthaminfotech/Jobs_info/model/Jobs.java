package com.gouthaminfotech.Jobs_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobs {
    @Id
    public long jobid;
    public String jobtitle;
    public String jobdescription;
    public String joblocation;
    public String jobtype;
    public String jobcategory;
    public String jobstatus;
    public String jobstartdate;
    public String jobenddate;
    public String jobcompanyname;
    public String jobcompanywebsite;
    public String salary;
    public String experience;
}
