package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterDisplayTest {


    @Before
    public void setUp()
    {
        CharacterDisplay ob=null;

    }

    @After
    public void tearDown()
    {
        CharacterDisplay ob=null;

    }


    @Test
    public void CheckingtheGivenCharacterisDigit()
    {
        CharacterDisplay ob=new CharacterDisplay();
        String str=ob.display('5');
        assertEquals("Digit",str);
    }

    @Test
    public void CheckingtheGivenCharacterisSmall()
    {
        CharacterDisplay ob=new CharacterDisplay();
        String str=ob.display('a');
        assertEquals("Small Letter",str);
    }

    @Test
    public void CheckingtheGivenCharacterisCapital()
    {
        CharacterDisplay ob=new CharacterDisplay();
        String str=ob.display('S');
        assertEquals("Capital Letter",str);
    }
}