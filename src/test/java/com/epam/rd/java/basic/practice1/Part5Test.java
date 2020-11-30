package com.epam.rd.java.basic.practice1;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class Part5Test {
    @Test
    public void main() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        Part5.main(new String[]{"43"});

        assertEquals("7", outContent.toString());
    }
}
