package com.vinicin.API.Rest.controller.generates;

import com.vinicin.API.Rest.service.generates.GenerateCnhService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnh")
public class CnhController {
    private final GenerateCnhService generateCnhService;
    public CnhController(GenerateCnhService generateCnhService) {
        this.generateCnhService = generateCnhService;
    }

    @GetMapping("/generate")
    public String generateCnh() {
        return generateCnhService.generateCnh();
    }
}
