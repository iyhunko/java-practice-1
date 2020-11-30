package com.epam.rd.java.basic.practice1;

public class Part7 {

    private static final char[] ALPHABET = new char[]{
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public static void main(String[] args) {
        System.out.println("A ==> " + str2int("A") + " ==> " + int2str(1));
        System.out.println("B ==> " + str2int("B") + " ==> " + int2str(2));
        System.out.println("Z ==> " + str2int("Z") + " ==> " + int2str(26));
        System.out.println("AA ==> " + str2int("AA") + " ==> " + int2str(27));
        System.out.println("AZ ==> " + str2int("AZ") + " ==> " + int2str(52));
        System.out.println("BA ==> " + str2int("BA") + " ==> " + int2str(53));
        System.out.println("ZZ ==> " + str2int("ZZ") + " ==> " + int2str(702));
        System.out.println("AAA ==> " + str2int("AAA") + " ==> " + int2str(703));
    }

    public static int str2int(String columnName) {
        int result = 0;

        for (int i = 0; i < columnName.length(); i++) {
            result *= ALPHABET.length;
            result += columnName.charAt(i) - ALPHABET[0] + 1;
        }

        return result;
    }

    public static String int2str(int number) {
        StringBuilder columnName = new StringBuilder();

        while (number > 0) {
            int rem = number % ALPHABET.length;

            if (rem == 0) {
                columnName.append(ALPHABET[ALPHABET.length - 1]);
                number = (number / ALPHABET.length) - 1;
            } else {
                columnName.append((char) ((rem - 1) + ALPHABET[0]));
                number = number / ALPHABET.length;
            }
        }

        return columnName.reverse().toString();
    }

    public static String rightColumn(String columnName) {
        int letterNumber = str2int(columnName) + 1;

        return int2str(letterNumber);
    }
}
