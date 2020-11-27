package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for(String arg: args) {
            if (!arg.trim().equals("")) {
                // Don't add a space before new element if it's the first argument
                if (result.length() != 0) {
                    result.append(" ");
                }

                result.append(arg.trim());
            }
        }

        System.out.print(result.toString().trim());
    }
	
}
