package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersRepeatTest
{
    CharactersRepeat ob=new CharactersRepeat();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }

    @After
    public void tearDown()
    {
        System.out.println("After");
    }

    @Test
    public void checkStringAndReturnRepeated()
    {
        String str=ob.repeat("Gayathri",2);
        assertEquals("test case failed","Gayathriri",str);
    }
    @Test
    public void checkStringAndReturnNotRepeatedString()
    {
        String str=ob.repeat("Gayathri",0);
        assertEquals("test case failed","Gayathri",str);
    }

}
