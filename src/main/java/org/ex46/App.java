/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.ex46;

import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        printEach.printOutput(findWords(input.inputTo()));
    }

    public static Map<Integer,String> findWords(String string)
    {

        Map<Integer,String> returnMap = new HashMap<>();
        //int[] i;

        String split[] = string.split(" ");
        HashSet<String> list = new HashSet<String>(Arrays.asList(split));
        for(String s:list)
        {
            returnMap.put((countWord(split,s)),s+":");
        }
        return returnMap;
    }

    public static int countWord(String[] s, String match)
    {
        int count = 0;
        for (int i = 0; i < s.length; i++)
        {
            if (match.equals(s[i]))
            {
                count++;
            }
        }
        return count;
    }
}
