package com.vinicin.API.Rest.controller.generates;

import com.vinicin.API.Rest.service.generates.RgGenerateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rg")
public class RgController {
    private final RgGenerateService rgGenerateService;
    public RgController(RgGenerateService rgGenerateService) {
        this.rgGenerateService = rgGenerateService;
    }

    @GetMapping("/generate")
    public String generate() {
        return rgGenerateService.gerarRg();
    }
}
