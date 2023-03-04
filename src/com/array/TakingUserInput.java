package com.array;

import java.util.Scanner;

public class TakingUserInput {

    public void userInput() {
       int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        TakingUserInput takingUserInput = new TakingUserInput();
        takingUserInput.userInput();

    }
}
