package com.quizquestion;

public class NumberOfRefills {
    public int findRefills(int totalDistance, int travellDistBeingFull, int numberOfPumps, int[] compulsoryFills) {

        int count = 0;
        // starting point
        int i = 0;
        int distCovered = 0;
        while (distCovered < totalDistance) {
            if (i < numberOfPumps && compulsoryFills[i] <= distCovered + travellDistBeingFull) {
                distCovered = compulsoryFills[i];
                i++;
            } else {
                distCovered += travellDistBeingFull;
            }
            if (distCovered < totalDistance) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int totalDistance = 5;
//        int travelDistBeingFull = 1;
//        int numberOfPumps = 3;
        int[] compulsoryFills = {1, 2, 3, 4, 5};
        NumberOfRefills numberOfRefills = new NumberOfRefills();
        // numberOfRefills.findRefills(5, 1, 3,compulsoryFills);
        System.out.println(numberOfRefills.findRefills(5, 1, 3, compulsoryFills));
    }
}
