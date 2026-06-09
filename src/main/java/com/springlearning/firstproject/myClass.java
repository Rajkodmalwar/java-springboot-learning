package com.springlearning.firstproject;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class myClass {
    @GetMapping("abc")
        public String sayHello(){
            return "hello";
        }
    }

