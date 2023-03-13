package org.example.datastructures;

import java.util.Arrays;

public class Stack {
    Object[] arr = {"a", "b", "c", "d"};

    public void push(Object obj) {
        arr = Arrays.copyOf(arr, arr.length + 1);

    }

    public void print() {
        for (Object o : arr) {
            System.out.println(o.toString());
        }
    }
}
