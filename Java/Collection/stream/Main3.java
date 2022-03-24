package com.programmers.collection_0324.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        Random r = new Random();
        Stream.generate(r::nextInt)
                .limit(10)
                .forEach(System.out::println);

        // 주사위를 100번 던져서 6이 나올 확률?
        //count return type은 long
        long cnt = Stream.generate(() -> r.nextInt(6) + 1)
                .limit(100)
                .filter(i -> i == 6)
                .count();
        System.out.println("6이 나올 확률은: " + cnt);

        // 1부터 9까지의 랜덤값 중 중복되지 않은 숫자 3개를 array로 만들어
        int[] arr = Stream.generate(() -> r.nextInt(9) + 1)
                .distinct()
                .limit(3)
                .mapToInt(i -> i)
                .toArray();
        System.out.println("중복되지 않은 값은 :" + Arrays.toString(arr));

        // 0~200 사이 값 중에서 랜덤값 5개를 뽑아 내림차순으로 표시하시오
        int[] arr2 = Stream.generate(() -> r.nextInt(199) + 1)
                .limit(5)
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        System.out.println("랜덤값 5개 내림차순 정렬" + Arrays.toString(arr));
    }
}
