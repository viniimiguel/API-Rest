package com.vinicin.API.Rest.controllers;

import com.vinicin.API.Rest.services.resignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resignation")
public class generalController {
    @Autowired
    private resignationService service;

}
