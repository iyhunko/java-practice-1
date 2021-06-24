package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        int sum = 0;
        char[] digits = args[0].toCharArray();

        for (char digit : digits) {
            sum += Integer.parseInt(String.valueOf(digit));
        }

        System.out.print(sum);
    }

}
