package org.example.sortingalgorithms;

public class BubbleSort {
    public int[] sortArray(int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            boolean changed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                // Compare [i] and [i + 1]
                if (arr[i] <= arr[i + 1]) continue;

                // Swap [i] and [i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                changed = true;
            }
            isSorted = !changed;
        }

        return arr;
    }
}
