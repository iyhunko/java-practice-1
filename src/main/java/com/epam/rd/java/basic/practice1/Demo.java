package com.epam.rd.java.basic.practice1;

public class Demo {

    public static void main(String[] args) {
        System.out.printf("%nPart1:%n");
        Part1.main(new String[]{});

        System.out.printf("%n%nPart2:%n");
        Part2.main(new String[]{"1", "134", "2", "2.3", "adfsdf", "0.2"});

        System.out.printf("%n%nPart3:%n");
        Part3.main(new String[]{"1", "134", "2", "2.3", "adfsdf", "0.7"});

        System.out.printf("%n%nPart4:%n");
        Part4.main(new String[]{"10", "15", "2.3", "adfsdf", "0.7"});

        System.out.printf("%n%nPart5:%n");
        Part5.main(new String[]{"10", "15", "2.5", "adfsdf", "0.3"});

        System.out.printf("%n%nPart6:%n");
        Part6.main(new String[]{"14"});

        System.out.printf("%n%nPart7:%n");
        Part7.main(new String[]{});
    }
}
