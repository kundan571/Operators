package com.array;

public class SumOfOddNumber {
    public void sumOfOddArray(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args){
        int[] arr = { 12, 31, 8, 0, 4, 17, 19, 37};
        SumOfOddNumber oddSum = new SumOfOddNumber();
        oddSum.sumOfOddArray(arr);
    }
}
