package com.gouthaminfotech.Jobs_info.controller;

import com.gouthaminfotech.Jobs_info.config.Fullresponse;
import com.gouthaminfotech.Jobs_info.model.Jobs;
import com.gouthaminfotech.Jobs_info.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobservice;

    @PostMapping("/addjob")
    @ResponseStatus(HttpStatus.CREATED)
    public Jobs addjob(@RequestBody Jobs jobs){
        return jobservice.addJob(jobs);
    }

    @GetMapping("/getAlljobs")
    public List<Jobs> getalljobs(){
        return jobservice.getalljobs();
    }
    @GetMapping("with-user/{jobid}")
    public ResponseEntity<Fullresponse> getJobwithUserInfo(@PathVariable("jobid") long jobid) {
        return ResponseEntity.ok(jobservice.getJobWithUserInfo(jobid));
    }

}
