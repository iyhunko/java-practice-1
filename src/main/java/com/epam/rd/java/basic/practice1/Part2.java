package com.epam.rd.java.basic.practice1;


public class Part2 {

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }

        // If sum has no decimals, then print it without decimals
        if (sum % 1 == 0) {
            System.out.print((int) sum);
        } else {
            System.out.print(sum);
        }
    }

}
