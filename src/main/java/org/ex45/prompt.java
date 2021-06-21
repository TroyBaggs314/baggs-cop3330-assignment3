package org.ex45;

import java.util.Scanner;

public class prompt
{
    public static String prompt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like the new file to be called?");
        return sc.nextLine();
    }
}
