package com.pc.cloud.businessTwo.index.controller;

import com.pc.cloud.businessTwo.index.mapper.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @Value("${server.port}")
    String port;

    @Value("${pc.user-name}")
    String foo;

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/getUser")
    public String getUser(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
