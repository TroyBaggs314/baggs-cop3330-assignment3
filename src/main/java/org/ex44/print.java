package org.ex44;

import java.text.DecimalFormat;

public class print
{
    public static void printSequence(Product p)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Name: " + p.getName() + "\nPrice: " + df.format(p.getId()) + "\nQuantity: " + p.getQuantity());
    }
}
