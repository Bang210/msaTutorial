package com.example.msatutorial.client;

import com.example.msatutorial.Dto.NumsDto;
import com.example.msatutorial.entity.Nums;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "second-server")
public interface SecondServerClient {
    @GetMapping("/increase")
    ResponseEntity<Integer> sendInt();

    @PostMapping("/multiply")
    ResponseEntity<Integer> sendNums(NumsDto numsDto);
}