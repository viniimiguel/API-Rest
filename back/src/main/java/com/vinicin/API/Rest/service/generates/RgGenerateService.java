package com.vinicin.API.Rest.service.generates;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RgGenerateService {

    public String gerarRg() {
        Random numeroAleatorio = new Random();

        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            numeros[i] = numeroAleatorio.nextInt(10);
        }

        int digitoVerificador = calcularDigitoVerificador(numeros);

        StringBuilder rgGerado = new StringBuilder();
        for (int numero : numeros) {
            rgGerado.append(numero);
        }
        rgGerado.append(digitoVerificador);

        return rgGerado.toString();
    }

    private int calcularDigitoVerificador(int[] numeros) {
        int soma = 0;
        int peso = 2;

        for (int i = numeros.length - 1; i >= 0; i--) {
            soma += numeros[i] * peso;
            peso++;
        }
        int resto = soma % 11;
        int dv = 11 - resto;

        if (dv == 10 || dv == 11) {
            dv = 0;
        }

        return dv;
    }

    public boolean validarRg(String rg) {
        if (rg == null || rg.length() != 9) {
            return false;
        }

        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            numeros[i] = Character.getNumericValue(rg.charAt(i));
        }
        int digitoVerificador = Character.getNumericValue(rg.charAt(8));

        int dvCalculado = calcularDigitoVerificador(numeros);

        return digitoVerificador == dvCalculado;
    }

}
