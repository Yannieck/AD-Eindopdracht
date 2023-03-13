package org.example.datastructures;

import java.util.Arrays;

public class Stack {
    Object[] arr;

    public Stack() {
        arr = new Object[0];
    }

    public Object peek() {
        return arr[arr.length - 1];
    }

    public void push(Object obj) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = obj;
    }

    public Object pop() {
        if(arr.length < 1)
            throw new ArrayIndexOutOfBoundsException();

        Object obj = arr[arr.length - 1];
        arr = Arrays.copyOf(arr, arr.length - 1);
        return obj;
    }

    public boolean empty() {
        return arr.length == 0;
    }

    public void print() {
        System.out.println(arr.length);
        for (Object o : arr) {
            System.out.println(o.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
