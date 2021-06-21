package org.ex44;

public class archiveMatch
{
    public static Product match(Product[] p, String search)
    {
        for(int i = 0; i < p.length; i++)
        {
            //System.out.println(p[i].name);
            if(p[i].getName().equals(search))
            {
                return p[i];
            }
        }
        return null;
    }
}
