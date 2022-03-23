package com.programmers.java.Anonymous;

class Greeting implements MySupply{
    @Override
    public String supply() {
        return "Hello World";
    }
}

class SayHello implements MyInterface{
    @Override
    public void hi(){
        System.out.println(new Greeting().supply());
    }
}

public class Main {
    public static void main(String[] args) {
        new SayHello().hi();

        // 익명 클래스
        new MySupply(){
            @Override
            public String supply(){
                return "Hello World";
            }
        }.supply();

        // 익명 클래스
       MyInterface mi = new MyInterface() {
            @Override
            public void hi() {
                MySupply s= new MySupply() {
                    @Override
                    public String supply() {
                        return "Hello World";
                    }
                };
                System.out.println("hi");
            }
        };
       mi.hi();
    }
}
