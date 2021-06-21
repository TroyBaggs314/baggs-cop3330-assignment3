package org.ex41Test;

import org.ex41.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{

    @DisplayName("Test App.readFile")
    @Test
    void testGetBackS()
    {
        String[] s = new String[]{"Ling, Mai",
                "Johnson, Jim",
                "Zarnecki, Sabrina",
                "Jones, Chris",
                "Jones, Aaron",
                "Swift, Geoffrey",
                "Xiong, Fong"};
        assertArrayEquals(s,readFile.readFile());
    }

    @DisplayName("Test App.sortNames")
    @Test
    void testGetSortedS()
    {
        String[] s = new String[]{"Johnson, Jim",
                "Jones, Aaron",
                "Jones, Chris",
                "Ling, Mai",
                "Swift, Geoffrey",
                "Xiong, Fong",
                "Zarnecki, Sabrina"};
        assertArrayEquals(s,App.sortNames(readFile.readFile(),7));
    }

}