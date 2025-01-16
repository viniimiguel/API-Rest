package com.vinicin.API.Rest.service;

import org.springframework.stereotype.Service;

@Service
public class BinaryCalculatorService {

    public int binaryCalculator(int binary){
        String binaryString = String.valueOf(binary);
        int binaryNumberSize = binaryString.length();
        return binaryNumberSize;
    }
}
