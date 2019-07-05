package com.stackroute.pe1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StringRepeatTest
{
    StringRepeat ob=new StringRepeat();
    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @Test
    public void givenInputStringShouldReturnRepeated()
    {
        String s=ob.repeat("aishu",2);
        assertEquals("test case failed","aishuhuhu",s);
        System.out.println("Test Case 1");
    }
    @Test
    public void givenInputStringShouldReturnNotRepeated()
    {
        String s=ob.repeat("aishu",0);
        assertEquals("test case failed","aishu",s);
        System.out.println("Test Case 2");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
    }
}