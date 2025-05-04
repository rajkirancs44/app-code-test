package com.citi.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/test")
public class LoopTestController {

    @GetMapping("/sum1")
    public ResponseEntity<Integer> sumLoop1() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        return ResponseEntity.ok(sum);
    }

    @GetMapping("/sum2")
    public ResponseEntity<Integer> sumLoop2() {
        int sum = IntStream.rangeClosed(1, 1000).sum();
        return ResponseEntity.ok(sum);
    }
}