package org.ex43Test;

import org.ex43.App;
import org.ex43.info;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.ex44.App.parseJsonToObject;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AppTest
{

    @DisplayName("Full test")
    @Test
    void testGet1()
    {
        info i = new info();
        i.webName = "testwebco";
        i.author = "instructor";
        i.js = true;
        i.css = true;
        App.folderCreation(i);
        File dir = new File("./src/website/" + i.webName);
        if (!dir.exists())
        {
            fail("Directory does not exist.");
        }
    }

}