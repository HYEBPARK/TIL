package com.programmers.java.Lambd;

public class Main {
    public static void main(String[] args) {

        MySupplier<String> s = () -> "Hello World";

        // MyMapper m = (str) -> str.length();
        MyMapper<String, Integer> m = String::length; // method reference
        MyMapper<Integer, Integer> m2 = i -> i * i;
        MyMapper<Integer, String> m3 = Integer::toHexString;
        // MyConsumer c = (i) -> System.out.println(i);
        MyConsumer<Integer> c = System.out::println; // method reference
       
        MyRunnable r = () -> c.consume(m.map(s.supply()));

        r.run();


    }
}
