package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void sortInteger(){

//		Act
        int result = sorting.sort(73914);


//		Assert
        assertEquals("TestPassed",97431, result);
    }


    @Test
    public void sortIntegerWhichContainsZero(){

     //Act
        int result = sorting.sort(43024);
        //Assert
        assertEquals("TestPassed",44320, result);
    }
}
