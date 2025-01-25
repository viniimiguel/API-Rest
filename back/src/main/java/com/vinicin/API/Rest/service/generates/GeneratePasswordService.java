package com.vinicin.API.Rest.service.generates;

import org.springframework.stereotype.Service;

@Service
public class GeneratePasswordService {
    private static String stringUpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static String stringLowerCase = "qwertyuiopasdfghjklzxcvbnm";
    private static String numbers = "0123456789";
    private static String specialCharacters = "!@#$%¨&*()_-+=<>?/^";
    
    public String generateWeakPassword(String password) {
        return "weakPassword";
    }
    public String generateAveragePassword(String password) {
        return "averegePassword";
    }
    public String generateStrongPassword(String password) {
        return "strongPassword";
    }

}
