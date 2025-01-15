package com.vinicin.API.Rest.service;

import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class CpfGenerateService {

    public String generateCpf(){
        Random random = new Random();
        int[] cpf = new int[11];

        for(int i=0;i<9;i++){
            cpf[i] = random.nextInt(10);
        }
        cpf[9] = calculateVerifierDigit(cpf,10);

        cpf[10] = calculateVerifierDigit(cpf, 11);
        return String.format("%d%d%d.%d%d%d.%d%d%d-%d%d",
                cpf[0], cpf[1], cpf[2],
                cpf[3], cpf[4], cpf[5],
                cpf[6], cpf[7], cpf[8],
                cpf[9], cpf[10]);
    }
    private int calculateVerifierDigit(int[] cpf, int weight) {
        int sum = 0;
        for(int i=0;i < weight - 1; i++){
            sum += cpf[i] * weight--;
        }
        int remainder = sum % 11;
        return(remainder < 2) ? 0 : 11 - remainder;
    }
}
