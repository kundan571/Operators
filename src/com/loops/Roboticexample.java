package com.loops;

import java.util.Scanner;

public class Roboticexample {
    public static void main(String[] args) {
        System.out.println("Enter a Button: ");
        Scanner Sc = new Scanner(System.in);
        int button = Sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bye Bye");
                break;
            case 4:
                System.out.println("Good night");
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
