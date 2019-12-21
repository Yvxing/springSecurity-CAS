package com.ujiuye.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasSpringController {

    @RequestMapping("/getName")
    private void getName(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        System.out.println(name);
    }
}
