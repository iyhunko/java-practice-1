package com.epam.rd.java.basic.practice1;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Part4Test {
    @Test
    public void main() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        Part4.main(new String[]{"10", "15"});

        assertEquals("5", outContent.toString());
    }
}