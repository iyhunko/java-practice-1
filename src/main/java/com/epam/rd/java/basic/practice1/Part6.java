package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int numberOfElements = Integer.parseInt(args[0]);
        int max = 1000000;
        int amountOfPrinted = 0;

        if (numberOfElements == 0) {
            return;
        }

        for (int i = 2; i < max; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.print(i);
                amountOfPrinted++;
                if (amountOfPrinted == numberOfElements) {
                    break;
                } else {
                    System.out.print(' ');
                }
            }
        }
    }
}
