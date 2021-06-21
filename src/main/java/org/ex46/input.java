package org.ex46;


import java.io.File;
import java.util.Scanner;

public class input
{
    public static String inputTo()
    {
        String s = "";
        try
        {
            File file = new File("src/main/java/org/ex46/exercise46_input.txt");
            Scanner sc = new Scanner(file);
            int i = 0;
            while(sc.hasNext())
            {
                s += sc.next() + " ";
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return s;
    }
}
