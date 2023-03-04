package com.array;

public class ReverseString {
    public void reverseStringArray(char[] arr, int low, int high){
        while (low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public void printArray(char[] arr){
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseString reverseArray = new ReverseString();
        char[] str = {'a','b', 'c'};
        reverseArray.reverseStringArray(str,0,2);
        reverseArray.printArray(str);
    }
}
