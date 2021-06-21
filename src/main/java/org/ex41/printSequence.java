package org.ex41;

public class printSequence
{
    //print sequence will just loop through count size
    //for(~count)
    //s.o.print(arraylist.get(i)
    public static void printNames(String[] s, int count)
    {
        System.out.print("Total of " + count + " names\n-----------------\n");
        for(int i = 0; i < count; i++)
        {
            System.out.println(s[i]);
        }
    }
}
