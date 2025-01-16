package com.vinicin.API.Rest.service;

import org.springframework.stereotype.Service;

@Service
public class BinaryCalculatorService {

    public int binaryCalculator(String binary) {
        try {
            if (!binary.matches("[01]+")) {
                throw new IllegalArgumentException("Número binário inválido: " + binary);
            }
            int decimalValue = Integer.parseInt(binary, 2);
            System.out.println("Número binário: " + binary + " | Valor decimal: " + decimalValue);
            return decimalValue;
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter o número binário: " + binary);
            throw new IllegalArgumentException("Número binário inválido.", e);
        }
    }
}
