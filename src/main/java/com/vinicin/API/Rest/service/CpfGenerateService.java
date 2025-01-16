package com.vinicin.API.Rest.service;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class CpfGenerateService {

    private final Random random = new Random();

    public String generateFakeCpf() {
        int[] cpf = new int[11];

        for (int i = 0; i < 11; i++) {
            cpf[i] = random.nextInt(10);
        }

        return formatCpf(cpf);
    }

    public String generateValidCpf() {
        int[] cpf = new int[11];

        for (int i = 0; i < 9; i++) {
            cpf[i] = random.nextInt(10);
        }

        cpf[9] = calculateVerifierDigit(cpf, 9);
        cpf[10] = calculateVerifierDigit(cpf, 10);

        return formatCpf(cpf);
    }

    private int calculateVerifierDigit(int[] cpf, int length) {
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += cpf[i] * (length + 1 - i);
        }

        int remainder = sum % 11;
        return (remainder < 2) ? 0 : 11 - remainder;
    }

    private String formatCpf(int[] cpf) {
        return String.format("%d%d%d.%d%d%d.%d%d%d-%d%d",
                cpf[0], cpf[1], cpf[2],
                cpf[3], cpf[4], cpf[5],
                cpf[6], cpf[7], cpf[8],
                cpf[9], cpf[10]);
    }
}