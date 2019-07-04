package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest
{


    Reverse ob = new Reverse();


    @Before
    public void setUp() {

        System.out.println("Before");
    }

    @After
    public void tearDown()
    {
        System.out.println("After");
    }


    @Test
    public void ReverseSetTheGivenString() {
        String str = ob.stringReverse("gayee");
        assertEquals("test passed", "eeyag", str);
    }

}
