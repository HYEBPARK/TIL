package com.programmers.collection_0324.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {

        // Optional 은 null이 될 수 있는 값을 옮겨주는 운반체
        Optional<OptionalUser> optionalUser = Optional.empty();
        // 값이 있다면
        optionalUser = Optional.of(new OptionalUser(1, "홍길동"));

        // 값이 없으면(null) true
        optionalUser.isEmpty();

        // 값이 있으면 true
        optionalUser.isPresent();

        // 값이 있다면 ~ 
        optionalUser.ifPresent(user -> {});

        // user -> 있다면, 없다면
        optionalUser.ifPresentOrElse(user -> {}, () -> {});
    }
}
