package com.example.msatutorial.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "second-service", path = "${second.server.prefix}")
public interface SecondServerClient {
    @GetMapping("/increase")
    ResponseEntity<Integer> sendInt();
}
