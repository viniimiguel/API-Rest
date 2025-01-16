package com.vinicin.API.Rest.controller;

import com.vinicin.API.Rest.service.BinaryCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/binary")
public class BinaryCalculatorController {
    private final BinaryCalculatorService binaryCalculatorService;

    public BinaryCalculatorController(BinaryCalculatorService binaryCalculatorService) {
        this.binaryCalculatorService = binaryCalculatorService;
    }

    @GetMapping("/calc")
    public int calc() {
        return binaryCalculatorService.binaryCalculator(1010);
    }
}
