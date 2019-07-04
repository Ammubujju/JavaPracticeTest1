package com.stackroute.pe1;


public class EvenOdd
{
    String str="";
    int n;

    public String add(int n)
    {
        if (n > 20 && n < 30)
        {
            if (n % 2 == 0)

                str =  "Jerry";

             else

                str="Tom";

        }
        else
            str="not in range";


        return str;

    }
}