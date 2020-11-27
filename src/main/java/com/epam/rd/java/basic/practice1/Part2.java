package com.epam.rd.java.basic.practice1;

import java.util.regex.Pattern;

public class Part2 {

    private static final Pattern isNumericPattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (isNumericPattern.matcher(arg).matches()) {
                sum += Double.parseDouble(arg);
            }
        }

        // If sum has no decimals, then print it without decimals
        if (sum % 1 == 0) {
            System.out.print((int) sum);
        } else {
            System.out.print(sum);
        }
    }

}
