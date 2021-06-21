/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.ex44;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.Reader;

public class App
{
    public static void main (String[] args)
    {
        loop(archiveMatch.match(parseJsonToObject(),askUser.readInput(false)));
    }

    public static void loop(Product p)
    {
        if(p != null)
        {
            print.printSequence(p);
        }
        else
        {
            loop(archiveMatch.match(parseJsonToObject(),askUser.readInput(true)));
        }
    }
    /* parseJsonToObject
       use gson's default reader to parse into class Product
       make Reader file
       if(file)
        gson.parseString = Class.name
        gson.parseDouble = Class.price
        gson.parseInt = Class.quantity

     */

    public static Product[] parseJsonToObject()
    {
        Gson gson = new Gson();
        try(Reader r = new FileReader("src/main/java/org/ex44/exercise44_input.json"))
        {
            Product[] p = gson.fromJson(r, Product[].class);
            r.close();
            return p;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
