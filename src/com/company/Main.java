package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {-7.6, -4.31, -1.63, -0.90, 3.21, 4.093, -1.53, 0.12, -2.14, 2.83, 3.21, -7.67, -3.30, 3.42, 1.03};

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(Arrays.toString(array));


            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    double tmpValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmpValue;
                }
            }
        }

        double numValue = 0.0;
        int intValue = 0;
        boolean value = false;


        for (double diob : array) {
            if (diob < 0) {
                value = true;
            } else if (value) {
                numValue += diob;
                intValue++;
            }
        }
        double ty = numValue / intValue;

        System.out.println("\n Среднее значений арифметическое положительных:" + ty);
    }
}
