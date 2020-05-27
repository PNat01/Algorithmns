package com.ponna;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {8, 5, 2, 9, 5, 6, 3};

        int temp = -1;
        boolean flag = false;
        int i = 0;
        int cnt = 0;
        while(true) {
            flag = false;
            for(int j = 1; j < (arr.length - cnt ) && i < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
                i++;
            }

            if(!flag) {
                break;
            }
            else {
                i = 0;
                cnt++;
            }
        }
        for(int z: arr)
        System.out.print(z + " , ");
    }
}
