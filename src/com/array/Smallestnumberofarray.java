package com.array;

public class Smallestnumberofarray {
    public static void main(String[] args) {
        int temp = 0;
        //Declaration of array
        int [] arr = {9,7,20,3,25,45};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Smallest Number is : " + arr[0]);
    }
}
