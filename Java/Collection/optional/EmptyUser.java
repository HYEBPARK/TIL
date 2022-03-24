package com.programmers.collection_0324.optional;

public class EmptyUser {
    public static final EmptyUser EMPTY = new EmptyUser(0,"");
    private int age;
    private String name;

    public EmptyUser(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean checkAdult() {
        if (this == EMPTY) return false;
        return age >= 19;
    }

    @Override
    public String toString() {
        return name + "님은 19세 이상입니다.";
    }
}
