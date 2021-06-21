package org.ex42Test;

import org.ex42.App;
import org.ex42.nameSal;
import org.ex42.readInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{

    @DisplayName("Full test")
    @Test
    void testGet1()
    {
        ArrayList<String> s = new ArrayList<>();
        s = readInput.readFile();
        assertEquals("Jones,Aaron,46000", s.get(2));
    }

}