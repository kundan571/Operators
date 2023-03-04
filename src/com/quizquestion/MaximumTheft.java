package com.quizquestion;

public class MaximumTheft {
    public void maxAmount(int[] price, int[] weight) {
        double totalAmount = 0;
        double countWeight = 0;
        int maxWeight = 55;
        // Calculate per Kg Price
        for (int i = 0; i < weight.length; i++) {
            price[i] /= weight[i];
        }

        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price.length; j++) {
                if (price[i] > price[j]) {
                    int temp = price[i];
                    price[i] = price[j];
                    price[j] = temp;

                    temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;
                }
            }
        }


        for (int i = 0; i < price.length; i++) {
            System.out.println(weight[i] + " " + price[i]);
            if ((countWeight += weight[i]) <= maxWeight) {
                totalAmount += price[i] * weight[i];
            } else {
                double remainingweight = 0;
                remainingweight = countWeight - maxWeight;
                totalAmount += price[i] * remainingweight;
                System.out.println("Maximum Amount Theft: " + totalAmount);
                return;
            }
       }
    }

    public static void main(String[] args) {
        int[] weight = {17, 23, 27, 22};
        int[] price = {23000, 28000, 35000, 27000};
          MaximumTheft maximumTheft = new MaximumTheft();
          maximumTheft.maxAmount(price, weight);
    }
}
