package org.ex42;

import java.util.ArrayList;

public class printSequence
{
    public static void printOutput(ArrayList<nameSal> ns)
    {
        System.out.print("Last\t First\t  Salary\n--------------------------\n");
        for(int i = 0; i < ns.size(); i++)
        {
            System.out.print(String.format("%-9s %-9s %d\n",ns.get(i).fName,ns.get(i).lName,ns.get(i).sal));
        }
    }
}
