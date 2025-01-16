package com.vinicin.API.Rest.service;

import org.springframework.stereotype.Service;

@Service
public class BinaryCalculatorService {

    public int binaryCalculator(int binary){
        String binaryString = String.valueOf(binary);
        String reversedBinary = new StringBuilder(binaryString).reverse().toString();
        int binaryNumberSize = reversedBinary.length();
        int binaryNumber = Integer.parseInt(reversedBinary);
        System.out.print(reversedBinary);

        return binaryNumber;
    }
}
