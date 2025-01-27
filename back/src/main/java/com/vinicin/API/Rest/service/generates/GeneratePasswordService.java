package com.vinicin.API.Rest.service.generates;

import org.springframework.stereotype.Service;
import java.security.SecureRandom;

@Service
public class GeneratePasswordService {
    private static final String stringUpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String stringLowerCase = "qwertyuiopasdfghjklzxcvbnm";
    private static final String numbers = "0123456789";
    private static final String specialCharacters = "!@#$%¨&*()_-+=<>?/^";

    private final SecureRandom random = new SecureRandom();

    public String generateWeakPassword(int numberOfDigits) {
        String characters = stringLowerCase + numbers;
        return generatePassword(characters, numberOfDigits);
    }

    public String generateAveragePassword(int numberOfDigits) {
        String characters = stringLowerCase + stringUpperCase + numbers;
        return generatePassword(characters, numberOfDigits);
    }

    public String generateStrongPassword(int numberOfDigits) {
        String characters = stringLowerCase + stringUpperCase + numbers + specialCharacters;
        return generatePassword(characters, numberOfDigits);
    }

    private String generatePassword(String characters, int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Number of digits must be greater than 0.");
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}