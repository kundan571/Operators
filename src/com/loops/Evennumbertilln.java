package com.loops;

import java.util.Scanner;

public class Evennumbertilln {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }

            }
        }
    }

