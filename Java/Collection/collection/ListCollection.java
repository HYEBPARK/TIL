package com.programmers.collection_0324.collection;

import com.programmers.collection_0324.iterator.IteratorInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListCollection<T> {
    private List<T> list;

    public ListCollection(List<T> list){
        this.list = list;
    }
    //map
    public <U> ListCollection<U> map(Function<T, U> function){
            List<U> list = new ArrayList<>();
            foreach(d -> list.add(function.apply(d)));
            return new ListCollection<>(list);
    }

    public void foreach(Consumer<T> consumer) {
        for (int i = 0; i < list.size(); i++) {
            T data = list.get(i);
            consumer.accept(data);
        }
    }

    //filter
    public ListCollection<T> filter(Predicate<T> predicate){
        List<T> list = new ArrayList<>();
        foreach(d -> {
            if (predicate.test(d))
                list.add(d);
        });
        return new ListCollection<>(list);
    }
    // list 사이즈 구하는 함수
    public int size() {
        return list.size();
    }

    // iterator 구현
    public IteratorInterface<T> iterator() {
        return new IteratorInterface<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < list.size();
            }

            @Override
            public T next() {
                return list.get(i++);
            }
        };
    }
}
