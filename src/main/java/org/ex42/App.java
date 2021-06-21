/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.ex42;
import java.lang.String;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        printSequence.printOutput(parseInput(new readInput().readFile()));
    }

    public static ArrayList<nameSal> parseInput(ArrayList<String> s)
    {
        ArrayList<nameSal> finNs = new ArrayList<>();
        for(int i = 0; i < s.size(); i++)
        {
            nameSal ns = new nameSal();
            int k = 0;
            ns.fName = "";
            ns.lName = "";
            String salary = "";
            boolean fDone = false;
            boolean lDone = false;
            while(k < s.get(i).length())
            {
                if(!fDone && s.get(i).charAt(k) != ',')
                {
                    ns.fName += s.get(i).charAt(k);
                }
                else if (s.get(i).charAt(k) == ',' && !fDone)
                {
                    fDone = true;
                }
                else if((!lDone && fDone) && s.get(i).charAt(k) != ',')
                {
                    ns.lName += s.get(i).charAt(k);
                }
                else if (s.get(i).charAt(k) == ',' && (!lDone && fDone))
                {
                    lDone = true;
                }
                else if (lDone && fDone)
                {
                    salary = salary + s.get(i).charAt(k) ;
                }

                k++;
            }
            if(salary != "")
            {

                ns.sal = Integer.parseInt(salary);
                finNs.add(i,ns);
            }
        }
        return finNs;
    }
}
