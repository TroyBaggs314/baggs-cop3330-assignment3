package org.ex44Test;

import org.ex44.archiveMatch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.ex44.App.parseJsonToObject;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{

    @DisplayName("Full test")
    @Test
    void testGet1()
    {
        assertEquals(15,archiveMatch.match(parseJsonToObject(), "Thing").getId());
    }

}