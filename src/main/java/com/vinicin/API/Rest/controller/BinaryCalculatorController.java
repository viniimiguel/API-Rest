package com.vinicin.API.Rest.controller;

import com.vinicin.API.Rest.service.BinaryCalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/binary")
public class BinaryCalculatorController {
    private final BinaryCalculatorService binaryCalculatorService;

    public BinaryCalculatorController(BinaryCalculatorService binaryCalculatorService) {
        this.binaryCalculatorService = binaryCalculatorService;
    }

    @GetMapping("/calc")
    public int calc(@RequestParam String binary) {
        return binaryCalculatorService.binaryCalculator(binary);
    }
}
