package com.loops;

import java.util.Scanner;

public class Calculatorproblem {
    public static void main(String[] args) {
        System.out.println("Enter Two Number:");
        Scanner Sc = new Scanner(System.in);
        double a = Sc.nextDouble();
        double b = Sc.nextDouble();
        int operator = Sc.nextInt();
        switch(operator) {
            case 1 :
                System.out.println(a + b);
                break;
            case 2 :
                System.out.println(a - b);
                break;
            case 3 :
                System.out.println(a * b);
                break;
            case 4 :
                if(b == 0){
                    System.out.println("Invalid Division");
                }
                else{
                    System.out.println(a/b);
                }
                break;
            case 5 :
                if(b == 0){
                    System.out.println("Invalid Division");
                }
                else{
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
