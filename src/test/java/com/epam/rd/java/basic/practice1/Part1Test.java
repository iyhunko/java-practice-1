package com.epam.rd.java.basic.practice1;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Part1Test {
    @Test
    public void main() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        Part1.main(new String[]{});

        assertEquals("Hello, World", outContent.toString());
    }
}
