package com.epam.rd.java.basic.practice1;


import java.util.Arrays;

public class Part6 {

    public static void main(String[] args) {
        int numberOfElements = Integer.parseInt(args[0]);

        int[] result = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            if (i < 2) {
                result[i] = 2 + i;
            } else {
                result[i] = result[i - 1] + i;
            }
        }

        String delimiter = " ";

        System.out.print(Arrays.toString(result));
    }
}
