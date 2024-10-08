package com.study.benchmark.controller;

import com.study.benchmark.service.CalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraController {
    @Autowired
    CalculatorService service;

    @GetMapping("/calcular")
    public String calcula(@RequestParam int x, @RequestParam int y) {
        return "O resultado : " + service.calcular(x, y);
    }
}
