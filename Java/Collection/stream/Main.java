package com.programmers.collection_0324.stream;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("A", "AB", "ABC", "ABCD", "ABCDE")
                .stream()
                .map(s -> s.length())
                .filter(i -> i % 2 == 1)
                .forEach(System.out::println);

        Arrays.asList("A", "AB", "ABC", "A", "A")
                .stream()
                .map(s -> s.length())
                .filter(i -> i % 2 == 1)
                .count();
    }
}
