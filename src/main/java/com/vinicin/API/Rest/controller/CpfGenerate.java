package com.vinicin.API.Rest.controller;

import com.vinicin.API.Rest.service.CpfGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpf")
public class CpfGenerate {

    private final CpfGenerateService cpfGenerateService;

    public CpfGenerate(CpfGenerateService cpfGenerateService) {
        this.cpfGenerateService = cpfGenerateService;
    }
    @GetMapping("/generate-fake-cpf")
    public String generateCpf(){
        return cpfGenerateService.generateCpf();
    }
}
