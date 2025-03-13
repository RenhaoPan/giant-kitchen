package com.giant.kitchen.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dish/category")
@Slf4j
public class DishCatogoryController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
