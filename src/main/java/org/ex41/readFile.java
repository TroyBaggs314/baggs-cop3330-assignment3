package org.ex41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class readFile
{

    //need method for reading file
    //readFile
    //scanner sc = new scanner(file)
    //while(~)
    //arraylist.add(sc.nextline(file))
    //return arraylist

    public static String[] readFile ()
    {
        File file = new File("src/main/resources/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();
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

        String[] sArr = new String[s.size()];

        for(int i = 0; i < s.size(); i++)
        {
            sArr[i] = s.get(i);
        }
        return sArr;
    }
}
