package com.stackroute.pe1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest
{


    StringReverse ob = new StringReverse();


    @Before
    public void setUp() {

        System.out.println("Before");
    }

    @Test
    public void givenInputStringShouldReturnReverse() {
        String s = ob.stringreverse("aishu");
        assertEquals("test passed", "uhsia", s);
    }


    @After
    public void tearDown() {
        System.out.println("After");
    }


}