package com.scaler.dsa1.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class  WordCounter {
    public static long countWords(List<String> sentences) {
        return sentences.stream().filter(sentence -> !sentence.contains("Java"))
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .count();

    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Python is a programming language.",
                "JavaScript is used for web development.",
                "Ruby is known for its simplicity."
        );

        long wordCount = WordCounter.countWords(sentences);
        System.out.println(wordCount);
    }
}
