package com.loops;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        if(a == b){
            System.out.println("a is equal to b");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is lesser");
        }
    }
}
