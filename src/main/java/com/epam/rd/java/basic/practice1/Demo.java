package com.epam.rd.java.basic.practice1;

public class Demo {

    public static void main(String[] args) {
        args = new String[]{"10", "134", "2"};

        System.out.printf("%nPart1:%n");
        Part1.main(new String[]{});

        System.out.printf("%n%nPart2:%n");
        Part2.main(args);

        System.out.printf("%n%nPart3:%n");
        Part3.main(args);

        System.out.printf("%n%nPart4:%n");
        Part4.main(args);

        System.out.printf("%n%nPart5:%n");
        Part5.main(args);

        System.out.printf("%n%nPart6:%n");
        Part6.main(args);

        System.out.printf("%n%nPart7:%n");
        Part7.main(new String[]{});
    }
}
