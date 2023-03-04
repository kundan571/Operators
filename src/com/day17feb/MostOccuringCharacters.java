package com.day17feb;

public class MostOccuringCharacters {
    public static void main(String[] args) {
        String str = "something is better than nothing";
        int[] temp = new int[str.length()];

        char maxChar = str.charAt(0);

        int max;

        char[] string = str.toCharArray();

        for (int i = 0; i < string.length; i++) {
            temp[i] = 1;

            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    temp[i]++;
                    string[j] = '0';
                }
            }
        }
        max = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
                maxChar = string[i];
            }
        }
        System.out.println("Maximum occurring character is: " + maxChar);
    }
}

