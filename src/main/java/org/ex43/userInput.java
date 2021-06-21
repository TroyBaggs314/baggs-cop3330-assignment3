package org.ex43;

import java.util.Scanner;

public class userInput
{
    public static info input()
    {
        Scanner sc = new Scanner(System.in);
        info i = new info();
        System.out.print("Site name: ");
        i.webName = sc.nextLine();
        System.out.print("Author: ");
        i.author = sc.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String reply = sc.next();
        if(reply.equals("y"))
        {
            i.js = true;
        }
        else if (reply.equals("n"))
        {
            i.js = false;
        }
        System.out.print("Do you want a folder for CSS? ");
        reply = sc.next();
        if(reply.equals("y"))
        {
            i.css = true;
        }
        else if (reply.equals("n"))
        {
            i.css = false;
        }
        return i;
    }
}
