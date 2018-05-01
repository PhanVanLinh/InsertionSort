package com.toong;

// Pseudo code
// Main ideal: After each bubble, the highest value will place in the last of array
// Then we will keep bubble the remaining array
//
public class BubbleSort {

    private static void bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - i - 1; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j + 1];
                    arrs[j+ 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }

    public static void main(String[] args) {
        int arrs[] = {64, 25, 12, 22, 11};
        bubbleSort(arrs);
        printArray(arrs);
    }
}
