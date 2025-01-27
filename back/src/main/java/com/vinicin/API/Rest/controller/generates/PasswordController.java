package com.vinicin.API.Rest.controller.generates;

import com.vinicin.API.Rest.service.generates.GeneratePasswordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordController {

    private final GeneratePasswordService generatePasswordService;

    public PasswordController(GeneratePasswordService generatePasswordService) {
        this.generatePasswordService = generatePasswordService;
    }

    @GetMapping("/generate")
    public String generatePassword(@RequestParam(defaultValue = "forte") String typeOfPassword,
                                   @RequestParam(defaultValue = "8") int numberOfDigits) {
        switch (typeOfPassword.toLowerCase()) {
            case "fraca":
                return generatePasswordService.generateWeakPassword(numberOfDigits);
            case "media":
                return generatePasswordService.generateAveragePassword(numberOfDigits);
            case "forte":
                return generatePasswordService.generateStrongPassword(numberOfDigits);
            default:
                throw new IllegalArgumentException("Invalid password type. Choose between 'fraca', 'media', or 'forte'.");
        }
    }
}
