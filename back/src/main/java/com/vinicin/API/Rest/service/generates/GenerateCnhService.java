package com.vinicin.API.Rest.service.generates;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateCnhService {

    public String generateCnh() {
        Random random = new Random();
        int[] cnh = new int[11];

        for (int i = 0; i < 9; i++) {
            cnh[i] = random.nextInt(10);
        }

        cnh[9] = calculateFirstVerifyDigit(cnh);
        cnh[10] = calculateSecondVerifyDigit(cnh);
        StringBuilder cnhString = new StringBuilder();
        for (int digit : cnh) {
            cnhString.append(digit);
        }

        return cnhString.toString();
    }
    private int calculateFirstVerifyDigit(int[] cnh) {
        int[] weights = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += cnh[i] * weights[i];
        }

        int remainder = sum % 11;
        return (remainder < 2) ? 0 : 11 - remainder;
    }
    private int calculateSecondVerifyDigit(int[] cnh) {
        int[] weights = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += cnh[i] * weights[i];
        }

        int remainder = sum % 11;
        return (remainder < 2) ? 0 : 11 - remainder;
    }
}
