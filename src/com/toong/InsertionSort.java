package com.toong;

// Pseudo Code
// Main idea: For any item in array, insert it to suitable position by
// While a[j] < a[j-1], swap the a[j] and a[j-1]
//
public class InsertionSort {

    private static void insertionSort(int[] arrs) {
        for (int i = 1; i < arrs.length; i++) {
            int j = i;
            while (j > 0 && arrs[j] < arrs[j-1]){
                int temp = arrs[j-1];
                arrs[j-1] = arrs[j];
                arrs[j] = temp;
                j--;
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
        insertionSort(arrs);
        printArray(arrs);
    }
}
