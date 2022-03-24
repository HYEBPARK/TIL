package com.programmers.collection_0324.collection;

public class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean checkAdult() {
        return age >= 19;
    }

    @Override
    public String toString() {
        return name + "님은 19세 이상입니다.";
    }
}
