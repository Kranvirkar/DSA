package com.scaler.dsa1.Stream;

import java.util.Arrays;
import java.util.List;

public class AverageRound {
    public static int processSentences(List<String> sentences) {
        return (int)sentences.stream()
                .filter(str -> str.contains("Java"))
                .mapToInt(String::length)
                .average()
                .orElse(-1);


    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a good language.",
                "Java stream processing is powerful.",
                "C++ is not as popular as Java."
        );

        int averageLength = AverageRound.processSentences(sentences);
        System.out.println(averageLength);

        sentences = Arrays.asList(
                "Python is a programming language.",
                "JS is used for web development.",
                "Ruby is known for its simplicity.",
                "java is good"
        );

        averageLength = AverageRound.processSentences(sentences);
        System.out.println(averageLength);
    }
}
