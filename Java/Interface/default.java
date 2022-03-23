package com.programmers.java.def;

interface MyInterface {
    void method(); // 추상메서드

    default void sayHello() {
        System.out.println("Hello world");
    }
}

public class Main implements MyInterface{
    public static void main(String[] args) {
        new Main().sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("BYE WORLD");
    }

    @Override
    public void method() {
        throw new RuntimeException();
    }
}
