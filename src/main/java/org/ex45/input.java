package org.ex45;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class input
{
    public static void main(String[] args)
    {
        inputToArray();
    }
    public static ArrayList<String> inputToArray()
    {
        ArrayList<String> s = new ArrayList<>();
        try
        {
            File file = new File("src/main/java/org/ex45/exercise45_input.txt");
            Scanner sc = new Scanner(file);
            int i = 0;
            while(sc.hasNextLine())
            {
                s.add(i,sc.nextLine());
                i++;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return s;
    }
}
