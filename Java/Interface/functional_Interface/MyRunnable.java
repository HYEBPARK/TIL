package com.programmers.java.functional_Interface;

// 함수형 인터페이스 : 추상 메소드가 하나밖에 없는 메소드
@FunctionalInterface
public interface MyRunnable {
    void run();
}


interface MyRunnable2 {
    void run1();
    void run2();
}

@FunctionalInterface
interface MyMap{
    void map();
    default void sayHello(){
        System.out.println("Hello World");
    }
    static void sayBye(){
        System.out.println("Bye World");
    }
}