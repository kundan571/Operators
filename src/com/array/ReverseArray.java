package com.array;

public class ReverseArray {


    public void reverseArray(int[] arr) {
        int high = arr.length - 1;
        int low = 0;
        for (int i = low; i < high; i++) {

            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseArray revrArray = new ReverseArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        revrArray.reverseArray(arr);
        revrArray.printArray(arr);
    }
}
