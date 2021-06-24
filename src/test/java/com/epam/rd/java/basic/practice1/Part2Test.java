package com.epam.rd.java.basic.practice1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Part2Test {
    @Test
    public void main() {
        assertEquals(2, Part7.str2int("B"));
        assertEquals(27, Part7.str2int("AA"));
        assertEquals(702, Part7.str2int("ZZ"));
        assertEquals(703, Part7.str2int("AAA"));

        assertEquals("B", Part7.int2str(2));
        assertEquals("AA", Part7.int2str(27));
        assertEquals("ZZ", Part7.int2str(702));
        assertEquals("AAA", Part7.int2str(703));

        assertEquals("C", Part7.rightColumn("B"));
        assertEquals("AB", Part7.rightColumn("AA"));
        assertEquals("AA", Part7.rightColumn("Z"));
    }
}