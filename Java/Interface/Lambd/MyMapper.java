package com.programmers.java.Lambd;

@FunctionalInterface
public interface MyMapper<IN, OUT> {
     OUT map(IN s);
}
