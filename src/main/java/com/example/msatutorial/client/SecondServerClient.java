package com.example.msatutorial.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "second-server")
public interface SecondServerClient {
    @GetMapping("/increase")
    ResponseEntity<Integer> sendInt();
}