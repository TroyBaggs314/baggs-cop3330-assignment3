package org.ex45Test;

import org.ex45.App;
import org.ex45.input;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.ex45.App.searchForKeyword;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{

    @DisplayName("Full test")
    @Test
    void testGet2()
    {
        ArrayList<String> s = new ArrayList<>();
        s.add("One should never use the word \"use\" in writing. Use \"use\" instead.");
        s.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        s.add("uses an IDE to write her Java programs\".");
        assertEquals(s,searchForKeyword(input.inputToArray(),"utilize","use"));
    }

}