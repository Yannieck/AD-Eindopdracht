package org.example;

import org.example.sortingalgorithms.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BubbleSort bs = new BubbleSort();

        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(bs.sortArray(new int[]{5, 1, 4, 2, 8})));
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }
}