package com.array;

public class Secondlargestnumber {
    public static void main(String[] args) {
        int temp = 0;
        int [] arr = {2,6,8,3,5,9};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }
        System.out.println("second largest number is: " + arr[arr.length-2]);

    }
}
