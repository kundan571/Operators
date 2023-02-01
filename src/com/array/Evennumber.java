package com.array;

public class Evennumber {
    public static void main(String[] args) {
        int index = 0;
        // arr declaration and instantiation
        int [] arrEven = new int[100]; //
        for(int i = 2; i <= 200; i++){
            if(i % 2 == 0){
                // arr initialization
                arrEven[index] = i;
                index++;
                System.out.println(index + "th element: " + i);
                i++;
            }

        }
    }
}
