package com.toong;

// Pseudo code
// Main idea: after a for we will the a minimum number then put it to the first of array
// for (i = 0; i < arr.length; i++){
//    Find the minimumNumberPosition from i to the end of array
//    Swap the value at i to the value at minimumNumberPosition
// }
//
public class SelectionSort {

    private static void selectionSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            int minimumNumberPosition = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[minimumNumberPosition] > arrs[j]) {
                    minimumNumberPosition = j;
                }
            }
            if (minimumNumberPosition != i) {
                int temp = arrs[minimumNumberPosition];
                arrs[minimumNumberPosition] = arrs[i];
                arrs[i] = temp;
            }
        }
    }

    private static void printArray(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }

    public static void main(String[] args) {
        // write your code here
        int arrs[] = {64, 25, 12, 22, 11};
        selectionSort(arrs);
        printArray(arrs);
    }
}
