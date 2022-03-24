package com.programmers.collection_0324.collection;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {

        // 어떤 데이터 타입이든 사용할 수 있음
        new ListCollection<>(
                Arrays.asList(
                        new User(15, "A"),
                        new User(16, "B"),
                        new User(17, "C"),
                        new User(23, "D")
                )
        )
                .filter(User::checkAdult)
                .foreach(System.out::println);
    }
}
