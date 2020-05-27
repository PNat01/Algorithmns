package com.ponna;

public class SelectionSort1 {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};
        int minIndex = 0;
        for(int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                   minIndex = j;
                }
            }

            swap(arr, i, minIndex);
        }

        for(int z: arr) {
            System.out.print(z + ", ");

        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
