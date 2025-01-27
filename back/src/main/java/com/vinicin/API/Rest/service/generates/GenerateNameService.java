package com.vinicin.API.Rest.service.generates;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GenerateNameService {
    Random random = new Random();
    private String[] female = {
            "Helena", "Alice", "Laura", "Maria Alice", "Cecília", "Maitê", "Liz", "Aurora",
            "Antonella", "Heloísa", "Maria Cecília", "Maria Clara", "Manuela", "Maya",
            "Sophia", "Valentina", "Elisa", "Maria Helena", "Isabella", "Eloá", "Ayla",
            "Lara", "Lívia", "Maria Júlia", "Lorena", "Melissa", "Sofia", "Isabela",
            "Luísa", "Beatriz", "Júlia", "Mariana", "Isadora", "Maria Luiza", "Ana Liz",
            "Rebeca", "Isis", "Maria Eduarda", "Aylla", "Esther", "Manuella", "Sarah",
            "Ísis", "Maria Liz", "Olívia", "Lavínia", "Ana Laura", "Catarina", "Maria",
            "Luna", "Ana Clara", "Luiza", "Yasmin", "Marina", "Emanuelly", "Giovanna",
            "Jade", "Eloah", "Julia", "Clara", "Maria Luísa", "Ana Júlia", "Ester",
            "Anna Liz", "Agatha", "Stella", "Alícia", "Gabriela", "Maria Laura", "Sara",
            "Maria Flor", "Heloisa", "Hellena", "Clarice", "Maria Isis", "Bella",
            "Isabelly", "Melina", "Mirella", "Rafaela", "Vitória", "Maria Julia",
            "Cecilia", "Allana", "Olivia", "Alana", "Zoe", "Mariah", "Ana Luiza",
            "Lunna", "Bianca", "Hadassa", "Maria Vitória", "Maria Fernanda", "Luara",
            "Milena", "Ágatha", "Laís", "Ana Cecília", "Ana Beatriz"
    };
    private String[] male = {
            "Miguel", "Heitor", "Gael", "Arthur", "Bernardo", "Davi", "Ravi", "Noah",
            "Samuel", "Théo", "Gabriel", "Anthony", "Pedro", "Benício", "Joaquim",
            "Isaac", "Lorenzo", "João Miguel", "Lucas", "Levi", "Henrique", "Rafael",
            "Henry", "Theo", "Nicolas", "Murilo", "Guilherme", "Benjamin", "Lucca",
            "Matheus", "Matteo", "Pedro Henrique", "Bento", "Gustavo", "Leonardo",
            "Vicente", "Daniel", "João Pedro", "Emanuel", "Pietro", "Davi Lucca",
            "Bryan", "Felipe", "Enzo Gabriel", "Antony", "Mateus", "Anthony Gabriel",
            "João Lucas", "Augusto", "João Guilherme", "Benjamim", "Thomas", "João",
            "Eduardo", "Antônio", "Yuri", "Enzo", "Oliver", "Rael", "Otávio", "Francisco",
            "Rhavi", "João Gabriel", "Nathan", "Mathias", "Caio", "Arthur Miguel",
            "Brayan", "Isaque", "José", "Ryan", "Ravi Lucca", "Enrico", "Davi Lucas",
            "Josué", "Benicio", "José Miguel", "Luan", "Luiz Miguel", "Ravy", "Vinícius",
            "Apollo", "Otto", "Theodoro", "Yan", "Dom", "Pedro Lucas", "Léo",
            "Davi Miguel", "Valentim", "Caleb", "José Pedro", "Liam", "Dante",
            "Gael Henrique", "Henry Gabriel", "Kevin", "Arthur Gabriel", "Asafe", "Erick"
    };

    public String generateName(String gender){
        if(gender.equals("male")){
            int index = random.nextInt(male.length);
            String randomName = male[index];
            return randomName;
        } else if (gender.equals("female")) {
            int index = random.nextInt(female.length);
            String randomName = female[index];
            return randomName;
        }
        return "genero incorreto";
    }


}
