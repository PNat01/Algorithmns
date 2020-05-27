package com.ponna;

public class BubbleSort1 {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};

        int i = 0;
        for(int y = 0; y < arr.length; y++) {
            i = 0;
            while(i < (arr.length - 1 - y)) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
                i++;
            }
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
