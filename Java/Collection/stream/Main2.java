package com.programmers.collection_0324.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3).stream();

        // primitive 타입을 위한 스트림이 따로 있음
        IntStream s2 = Arrays.stream((new int[]{1, 2, 3}));

        // boxed()를 이용해서 primitive type을 wrapper class 로 변환가능
        Arrays.stream(new int[]{1,2,3}).boxed();

        // generate로 발생시키고 있음, 1이 계속 출력됨
        Stream.generate(() -> 1)
                .forEach(System.out::println);

        // generate로 발생시키고 limit으로 제한 가능
        Random r= new Random();
        Stream.generate(r::nextInt)
                .limit(10)
                .forEach(System.out::println);

        // iterate 활용, seed 값이 넘어가서 식을 수행
        Stream.iterate(0, (i) -> i + 1);
    }
}
