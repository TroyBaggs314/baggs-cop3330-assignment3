package org.ex46Test;

import org.ex46.input;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.ex46.App.findWords;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.input()")
    @Test
    void testGet1()
    {
        assertEquals("badger badger badger badger mushroom mushroom snake badger badger badger ", input.inputTo());
    }
    @DisplayName("Test App.fulltest")
    @Test
    void testGet2()
    {
        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(7,"Badger");
        testMap.put(2,"mushroom");
        testMap.put(1,"snake");
        assertEquals(testMap, findWords(input.inputTo()));
    }

}