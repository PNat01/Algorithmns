package com.ponna;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        int temp = -1;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i; j >= 0; j--) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
                else {
                    break;
                }
            }//for
        }//for

        for(int z: arr)
            System.out.print(z + " , ");
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
