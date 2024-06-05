package com.example.msatutorial.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
@RequiredArgsConstructor
public class secondController {

    public int count;

    @GetMapping("")
    public String showSecond() {
        return "second";
    }

    @GetMapping("/increase")
    public int increase() {
        count++;
        return count;
    }
}
