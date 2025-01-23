package com.vinicin.API.Rest.service.generates;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class LoremIpsumService {

    public static final String[] LOREM_WORDS = {
            "lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit",
            "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore",
            "magna", "aliqua", "ut", "enim", "ad", "minim", "veniam", "quis", "nostrud",
            "exercitation", "ullamco", "laboris", "nisi", "ut", "aliquip", "ex", "ea",
            "commodo", "consequat", "duis", "aute", "irure", "dolor", "in", "reprehenderit"
    };
    private final Random random = new Random();

    public String generate(int wordCount){
        return Arrays.stream(new int[wordCount])
                .mapToObj(i -> LOREM_WORDS[random.nextInt(LOREM_WORDS.length)])
                .collect(Collectors.joining(" "));
    }
}
