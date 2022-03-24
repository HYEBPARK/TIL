package com.programmers.collection_0324.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        // Collection의 구상체 List
        LinkedList<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        // 리스트를 순회해서 출력
        for (Integer integer : list1) {
            // System.out.println(integer);
        }
        // Arrays.asList 찾아보기
        new ListCollection<>(list1)
                .foreach(System.out::println);
        // Collection에 map 함수 만들어서 적용해보기
       new ListCollection<>(Arrays.asList("AB", "BCD", "CDEFG"))
               .map(String::length)
               .filter(i -> i % 2 == 0)
               .foreach(System.out::println);

       // size 사용 예시
       int s = new ListCollection<>(Arrays.asList("AB", "BCD", "CDEFG"))
               .map(String::length)
               .filter(i -> i % 2 != 0)
               .size();
    }
}
