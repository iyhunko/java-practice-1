package com.epam.rd.java.basic.practice1;

public class Part7 {

    private static final char[] ALPHABET = new char[]{
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    public static void main(String[] args) {
        String int2strResult = int2str(1);
        System.out.println("int2str:");
        System.out.println("1 -> " + int2strResult);
        int2strResult = int2str(2);
        System.out.println("2 -> " +int2strResult);
        int2strResult = int2str(26);
        System.out.println("26 -> " +int2strResult);
        int2strResult = int2str(27);
        System.out.println("27 -> " +int2strResult);
        int2strResult = int2str(52);
        System.out.println("52 -> " +int2strResult);
        int2strResult = int2str(53);
        System.out.println("53 -> " +int2strResult);
        int2strResult = int2str(702);
        System.out.println("702 -> " +int2strResult);
        int2strResult = int2str(703);
        System.out.println("703 -> " +int2strResult);


        int str2intResult =  str2int("A");
        System.out.println("str2int:");
        System.out.println("a -> " +str2intResult);
        str2intResult = str2int("B");
        System.out.println("B -> " +str2intResult);
        str2intResult = str2int("Z");
        System.out.println("Z -> " +str2intResult);
        str2intResult = str2int("AA");
        System.out.println("AA -> " +str2intResult);
        str2intResult = str2int("AZ");
        System.out.println("AZ -> " +str2intResult);
        str2intResult = str2int("BA");
        System.out.println("BA -> " +str2intResult);
        str2intResult = str2int("ZZ");
        System.out.println("ZZ -> " +str2intResult);
        str2intResult = str2int("AAA");
        System.out.println("AAA -> " +str2intResult);

        String rightColumnName = rightColumn("A");
        System.out.println("rightColumn:");
        System.out.println("A->" + rightColumnName);
        rightColumnName = rightColumn("B");
        System.out.println("B->" + rightColumnName);
        rightColumnName = rightColumn("Z");
        System.out.println("Z->" + rightColumnName);
        rightColumnName = rightColumn("AA");
        System.out.println("AA->" + rightColumnName);
        rightColumnName = rightColumn("AZ");
        System.out.println("AZ->" + rightColumnName);
        rightColumnName = rightColumn("BA");
        System.out.println("BA->" + rightColumnName);
        rightColumnName = rightColumn("ZZ");
        System.out.println("ZZ->" + rightColumnName);
        rightColumnName = rightColumn("AAA");
        System.out.println("AAA->" + rightColumnName);
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
