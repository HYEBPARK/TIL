package com.programmers.java.default2;

public interface Ability {
    static void sayHello(){
        System.out.println("Hello World");
    }
}

interface Flyable {
    default void fly(){
        System.out.println("fly");
    };
}

interface Swimmable {
    default void swim(){
        System.out.println("swim");
    };
}

interface Walkable {
    default void walk(){
        System.out.println("walk");
    };
}

