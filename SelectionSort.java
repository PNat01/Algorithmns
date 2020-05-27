package com.ponna;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 5, 6, 3};

        int minIndex = -1;
        int temp = -1;
        for(int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }//for

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }//for

        for(int z: arr)
            System.out.print(z + " , ");


    }
}
