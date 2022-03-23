package com.programmers.java.Anonymous;

import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {


        MyInterface mi1= new MyInterface(){
            @Override
            public void hi(){
                System.out.println("hello");
            }
        };

        MyInterface mi2 = () -> System.out.println("Hello");
        // mi1과 mi2는 모두 익명클래스를 사용하여 표현했지만 mi2는 람다를 사용용

        MyInterface mi3 = () ->{
            MySupply s2 = () -> "Hello Hello WOrld";
            System.out.println(s2.supply());
        };
        mi3.hi();
    }
}
