package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd ob=new EvenOdd();

    @Before
    public void setUp()
    {
        EvenOdd ob=null;

    }

    @After
    public void tearDown()
    {
        EvenOdd ob=null;

    }

    @Test

    public void checkEvenNumber()
    {
        String d=ob.add(24);
        assertEquals("test case passed","Jerry",d);
    }

    @Test
    public void checkOddNumber()
    {
        String d=ob.add(21);
        assertEquals("test case passed","Tom",d);
    }

    @Test
    public void checkRangeNumber()
    {
        String d=ob.add(49);
        assertEquals("test case passed","not in range",d);
    }


}