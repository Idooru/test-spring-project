package com.example.myspringproject.controller;

import com.example.myspringproject.dataformat.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
    @GetMapping("/")
    public JsonFormat<String> getMainPage() {
        return new JsonFormat<>(200, "Success to connect!", "Hello My Spring!");
    }
}
