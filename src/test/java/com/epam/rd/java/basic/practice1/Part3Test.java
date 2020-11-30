package com.epam.rd.java.basic.practice1;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Part3Test {
    @Test
    public void main() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        Part3.main(new String[]{"1", "3"});

        assertEquals("1 3", outContent.toString());
    }
}