package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest
{
    VowelConsonant ob=new VowelConsonant();
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
    public void checkConsonantAndReturn()
    {
        String a=ob.check("d");
        assertEquals("test case passed","Consonant",a);
    }
    @Test
    public void checkVowelAndReturn()
    {
        String a=ob.check("a");
        assertEquals("test case passed","Vowel",a);
    }
    @Test
    public void checkIfNotMatchesReturnDigitNotMatching()
    {
        String a=ob.check("4");
        assertEquals("test case passed","Input is not a letter",a);
    }
    @Test
    public void checkIfNotMatchesReturn()
    {
        String a=ob.check("%");
        assertEquals("test case passed","Input is not a letter",a);
    }

}
