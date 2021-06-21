package org.ex45;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class writeNewOuput
{
    public static void writeToFile(ArrayList<String> s)
    {
        try
        {
            File file = new File("src/main/java/org/ex45/" + prompt.prompt() +".txt");
            FileWriter wr = new FileWriter(file);
            for(int i = 0; i < s.size(); i++)
            {
                wr.write(s.get(i) + "\n");
            }
            wr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
