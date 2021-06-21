package org.ex42;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class readInput
{
    public static ArrayList<String> readFile()
    {
        ArrayList<String> s = new ArrayList<>();
        File file = new File("src/main/resources/ex42/exercise42_input.txt");
        Scanner sc = new Scanner(System.in);
        try
        {
            sc = new Scanner(file);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        while(sc.hasNext())
        {
            s.add(sc.nextLine());
        }
        sc.close();
        return s;
    }
}
