package com.example.msatutorial.controller;

import com.example.msatutorial.dto.NumsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
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
        System.out.println("GET");
        return count;
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody NumsDto numsDto) {
        return numsDto.getNum1() * numsDto.getNum2();
    }

}
