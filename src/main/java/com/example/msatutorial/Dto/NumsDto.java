package com.example.msatutorial.Dto;

import com.example.msatutorial.entity.Nums;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NumsDto {
    private int num1;
    private int num2;

    public NumsDto(Nums nums) {
        this.num1 = nums.getNum1();
        this.num2 = nums.getNum2();
    }
}
