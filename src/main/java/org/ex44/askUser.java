package org.ex44;

import java.util.Scanner;

public class askUser
{
    public static String readInput(boolean loop)
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        if(loop == false)
        {
            System.out.print("What is the product name? ");
            s = sc.nextLine();
        }
        else if (loop)
        {
            System.out.print("Sorry, that product was not found in our inventory.\nWhat is the product name? ");
            s = sc.nextLine();
        }
        return s;
    }
}
