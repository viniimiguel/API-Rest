package com.vinicin.API.Rest.controller.generates;

import com.vinicin.API.Rest.service.generates.GenerateNameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameGenerateController {
    private final GenerateNameService generateNameService;

    public NameGenerateController(GenerateNameService generateNameService) {
        this.generateNameService = generateNameService;
    }

    @GetMapping("/generate")
    public String generate(@RequestParam(defaultValue = "male") String gender) {
        return generateNameService.generateName(gender);
    }
}
