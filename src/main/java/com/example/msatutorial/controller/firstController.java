package com.example.msatutorial.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
@RequiredArgsConstructor
public class firstController {

    @GetMapping("")
    public String showFirst() {
        return "first";
    }
}
