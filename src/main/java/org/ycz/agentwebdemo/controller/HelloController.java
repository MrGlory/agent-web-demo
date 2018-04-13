package org.ycz.agentwebdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/list")
    public Object list(HttpServletRequest req){
        return "123,123";
    }
    @RequestMapping("/")
    public Object get(HttpServletRequest req){
        return "123";
    }
}
