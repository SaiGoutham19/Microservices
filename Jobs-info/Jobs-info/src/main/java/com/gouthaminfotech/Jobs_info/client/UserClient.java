package com.gouthaminfotech.Jobs_info.client;

import com.gouthaminfotech.Jobs_info.config.Userinfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name ="Users-info",url = "http://localhost:9090/users")
public interface UserClient {
    @GetMapping("job/{jobid}")
    List<Userinfo>findByJobid(@PathVariable("jobid") long id);
}
