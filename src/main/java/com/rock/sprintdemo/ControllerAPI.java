package com.rock.sprintdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {

    @RequestMapping("han")
    public String han(){
        return "hello world";
    }

}
