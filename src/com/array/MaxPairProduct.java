package com.array;

public class MaxPairProduct {
    public static void main(String[] args) {
        int [] array = {1, 3, -9, -8, 2, 7, 10};
        int max = array[0] * array[1];
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (max < array[i] * array[j]){
                    max = array[i] * array[j];
                }
            }
        }
        System.out.println("The Max Pair Product Is: " + max);
    }
}
