package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddIntegersTest {

    AddIntegers  sumOfArray = new AddIntegers();

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void addPositiveIntegers(){

        int array[] = {3,6,32};
		//Act
        int result = sumOfArray.addNumbers(array);

        //Assert
        assertEquals(41, result);
    }

    @Test
    public void addNegativeValuesInArray(){

        int array[] = {3,6,-32};

//		Act
        int result = sumOfArray.addNumbers(array);

//  	Assert
        assertEquals(-23, result);
    }

}
