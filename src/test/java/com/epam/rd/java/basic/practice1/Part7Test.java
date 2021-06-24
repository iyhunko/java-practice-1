package com.epam.rd.java.basic.practice1;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Part7Test {
    @Test
    public void main() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        Part7.main(new String[]{"4"});

        assertEquals("2 3 5 7", outContent.toString());
    }
}