package com.example.msatutorial.controller;

import com.example.msatutorial.client.SecondServerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class firstController {

    private final SecondServerClient secondServerClient;

    @GetMapping("/main")
    public String showFirst() {
        return "first";
    }

    @GetMapping("/second/increase")
    public int increaseSecondCount() {
        return secondServerClient.sendInt().getBody();
    }
}
