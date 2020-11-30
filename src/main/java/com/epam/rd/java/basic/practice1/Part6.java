package com.epam.rd.java.basic.practice1;


public class Part6 {

    public static void main(String[] args) {
        int numberOfElements = Integer.parseInt(args[0]);

        int[] digits = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            if (i < 2) {
                digits[i] = 2 + i;
            } else {
                digits[i] = digits[i - 1] + i;
            }
        }

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < digits.length; i++) {
            if (i != 0) {
                result.append(" ");
            }
            result.append(digits[i]);
        }
        result.append("]");

        System.out.print(result.toString());
    }
}
