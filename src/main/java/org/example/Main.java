package org.example;

import org.example.datastructures.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stack stack = new Stack();
        stack.print();
        stack.push("e");
        stack.print();
    }
}