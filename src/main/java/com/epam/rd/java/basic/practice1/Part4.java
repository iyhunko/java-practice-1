package com.epam.rd.java.basic.practice1;

import java.util.regex.Pattern;

public class Part4 {

    private static final Pattern isNumericPattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static void main(String[] args) {
        double greatestCommonDivisor;
        double number1 = 0;
        double number2 = 0;

        for (String arg : args) {
            if (isNumericPattern.matcher(arg).matches() && Double.parseDouble(arg) > 0) {
                if (number1 == 0) {
                    number1 = Double.parseDouble(arg);
                } else {
                    number2 = Double.parseDouble(arg);

                    break;
                }
            }
        }

        greatestCommonDivisor = findGreatestCommonDivisor(number1, number2);

        // If sum has no decimals, then print it without decimals
        if (greatestCommonDivisor % 1 == 0) {
            System.out.print((int) greatestCommonDivisor);
        } else {
            System.out.print(greatestCommonDivisor);
        }
    }

    public static double findGreatestCommonDivisor(double a, double b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}
