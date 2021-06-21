package org.ex46;

import java.util.*;

public class printEach
{
    public static void printOutput(Map<Integer, String> map)
    {
        Map<Integer, String> reverseSortedMap = new TreeMap<>(Collections.reverseOrder());

        reverseSortedMap.putAll(map);
        for (Map.Entry<Integer, String> mapSet : reverseSortedMap.entrySet())
        {
            System.out.print(String.format("%-10s",mapSet.getValue()));
            for(int i = 0; i < mapSet.getKey(); i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
