/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Troy Baggs
 */
package org.ex41;
import java.io.File;
import java.sql.Array;
import java.util.Arrays;


public class App
{
    public static void main (String[] args)
    {
        readFile rf = new readFile();
        int count = countNames(rf.readFile());
        new printSequence().printNames(sortNames(rf.readFile(),count),count);
    }

    //need a method to return the size of the arraylist
    //count (arraylist)
    //return arraylist.size
    public static int countNames(String[] s)
    {
        return s.length;
    }

    //need a method to sort, won't be hard but will need to be an array to call .sort()
    //sortNames(arraylist,count)
    //arraylist to array
    // return array.sort();

    public static String[] sortNames (String[] s, int count)
    {
        Arrays.sort(s);
        return s;
    }
}
