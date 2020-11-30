package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        double sum = 0;
        double[] numbers = new double[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Double.parseDouble(args[i]);
        }

        for (double number : numbers) {
            sum += number;
        }

        // If sum has no decimals, then print it without decimals
        if (sum % 1 == 0) {
            System.out.print((int) sum);
        } else {
            System.out.print(sum);
        }
    }

}
