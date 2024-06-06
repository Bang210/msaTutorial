package com.example.msatutorial.controller;

import com.example.msatutorial.Dto.NumsDto;
import com.example.msatutorial.client.SecondServerClient;
import com.example.msatutorial.entity.Nums;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/multiply")
    public int multiply() {
        Nums nums = new Nums();
        nums.setNum1(20);
        nums.setNum2(35);
        NumsDto numsDto = new NumsDto(nums);
        return secondServerClient.sendNums(numsDto).getBody();
    }
}
