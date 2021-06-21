/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App
{
    public static void main(String[] args)
    {
        folderCreation(userInput.input());
    }
    public static void folderCreation(info i)
    {
        File dir = new File("./src/website/" + i.webName);
        if (!dir.exists())
        {
            dir.mkdirs();
        }
        System.out.println("Created ./src/website/" + i.webName);
        indexCreation(i);
    }

    public static void indexCreation(info i)
    {
        File index = new File("./src/website/" + i.webName + "/index.html");
        try
        {
            index.createNewFile();
            FileWriter wr = new FileWriter(index);
            wr.write("<html>\n\t<head>\n\t\t<title>" + i.webName + "</title>\n" +
                    "\t\t<meta name=\"author\" content=\"" + i.author + "\">\n" +
                    "\t</head>\n</html>");
            wr.close();
        }
        catch(IOException e)
        {

        }

        System.out.println("Created ./src/website/" + i.webName + "/index.html");
        jsCreation(i);
    }

    public static void jsCreation(info i)
    {
        if(i.js)
        {
            File js = new File("./src/website/" + i.webName + "/js/");
            if (!js.exists()) {
                js.mkdirs();
            }
            System.out.println("Created ./src/website/" + i.webName + "/js/");
        }
        cssCreation(i);
    }

    public static void cssCreation(info i)
    {
        if(i.css)
        {
            File css = new File("./src/website/" + i.webName + "/css/");
            if (!css.exists()) {
                css.mkdirs();
            }
            System.out.println("Created ./src/website/" + i.webName + "/css/");
        }

    }
}
