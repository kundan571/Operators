package com.loops;

import java.util.Scanner;

public class Sumofnaturalnumber {
    public static void main(String[] args) {
        System.out.println("Enter a Natural Number: ");
        Scanner Sc = new Scanner(System.in);
        int sum = 0;
        int n = Sc.nextInt();
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
