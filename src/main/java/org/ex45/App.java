/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.ex45;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        writeNewOuput.writeToFile(searchForKeyword(input.inputToArray(),"utilize","use"));
    }

    /* searchForKeyword given a keyword and an array to look through, sort through until an index is found and replace it
    for(~)
        while(indexOf(searchWord))
            new String s = before index + new word + after index
     */

    public static ArrayList<String> searchForKeyword(ArrayList<String> s, String needle, String replace)
    {
        for(int i = 0; i < s.size(); i++)
        {
            int index = 0;
            while(s.get(i).indexOf(needle) != -1)
            {
                index = s.get(i).indexOf(needle,index);
                s.set(i,replaceKeyword(index,s.get(i), needle, replace));
            }
        }
        return s;
    }

    public static String replaceKeyword(int index,String line,String needle,String replace)
    {
        String returnS = line.substring(0,index) + replace + line.substring((index + needle.length()));
        return returnS;
    }
}
