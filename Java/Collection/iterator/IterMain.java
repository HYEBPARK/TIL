package com.programmers.collection_0324.iterator;

import com.programmers.collection_0324.collection.ListCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterMain {
    public static void main(String[] args) {
        IteratorInterface<String> iter1 =
                new ListCollection<>(Arrays.asList("A", "AB", "ABC"))
                .iterator();

        List<String> list = Arrays.asList("A", "AB", "ABC");
        Iterator<String> iter2 = list.iterator();

        // 구현한 iter 함수
        while (iter1.hasNext()) {
            String s = iter1.next();
            int len = s.length();
            if (len % 2 == 0) continue;
            System.out.println(iter1.next());
        }

        // 내장함수
        while (iter2.hasNext())
            System.out.println(iter2.next());
    }
}
