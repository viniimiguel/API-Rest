package com.vinicin.API.Rest.service.generates;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CnpjGenerateService {
    public static String generateCnpj(){
        Random random = new Random();
        int[] cnpj = new int[14];

        for (int i = 0; i < 12; i++){
            cnpj[i] = random.nextInt(10);
        }
        cnpj[12] = calculateVerifyDigit(cnpj, new int[]{5,4,3,2,9,8,7,6,5,4,3,2});
        cnpj[13] = calculateVerifyDigit(cnpj, new int[]{6,5,4,3,2,9,8,7,6,5,4,3,2});
        return String.format("%02d.%03d.%03d/%04d-%02d",
                cnpj[0] * 10 + cnpj[1],
                cnpj[2] * 100 + cnpj[3] * 10 + cnpj[4],
                cnpj[5] * 100 + cnpj[6] * 10 + cnpj[7],
                cnpj[8] * 1000 + cnpj[9] * 100 + cnpj[10] * 10 + cnpj[11],
                cnpj[12] * 10 + cnpj[13]);
    }
    private static int calculateVerifyDigit(int[] cnpj, int[] weight){
        int sum = 0;
        for (int i = 0; i < weight.length; i++){
            sum += cnpj[i] * weight[i];
        }
        int remainder = sum % 11;
        return (remainder < 2) ? 0 : 11 - remainder;
    }
}


