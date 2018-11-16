package com.thoughtworks.nho.cicddemo.item;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @RequestMapping("/")
    public String get(){
        return "Hello World!";
    }
}
