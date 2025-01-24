package com.vinicin.API.Rest.controller.generates;

import com.vinicin.API.Rest.service.generates.CpfGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpf")
public class GenerateCpfController {

    private final CpfGenerateService cpfGenerateService;

    public GenerateCpfController(CpfGenerateService cpfGenerateService) {
        this.cpfGenerateService = cpfGenerateService;
    }

    @GetMapping("/generate")
    public String generateTrueCpf(){
        return cpfGenerateService.generateValidCpf();
    }
}
