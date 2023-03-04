package com.loops;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        System.out.println("Enter Today's Day:  ");
        Scanner Sc = new Scanner(System.in);
        String day = Sc.nextLine();
        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is tuesday");
                break;
            case "wednesday":
                System.out.println("Today is wednesday");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
