package com.vinicin.API.Rest.controller;

import com.vinicin.API.Rest.service.LoremIpsumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class LoremIpsumController {
    private final LoremIpsumService loremIpsumService;

    public LoremIpsumController(LoremIpsumService loremIpsumService) {
        this.loremIpsumService = loremIpsumService;
    }

    @GetMapping("/lorem")
    public String getLoremIpsum(@RequestParam(defaultValue = "100") int words){
        if(words <= 0){
            return "please specify a positive number";
        }
        return loremIpsumService.generate(words);
    }
}
