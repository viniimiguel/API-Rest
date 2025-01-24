package com.vinicin.API.Rest.controller.generates;

import com.vinicin.API.Rest.service.generates.CnpjGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnpj")
public class CnpjController {
    private final CnpjGenerateService cnpjGenerateService;

    public CnpjController(CnpjGenerateService cnpjGenerateService) {
        this.cnpjGenerateService = cnpjGenerateService;
    }

    @GetMapping("generate/cnpj")
    public String generateCnpj() {
        return cnpjGenerateService.generateCnpj();
    }
}
