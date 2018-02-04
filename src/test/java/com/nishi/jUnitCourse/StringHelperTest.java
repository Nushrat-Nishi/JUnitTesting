package com.nishi.jUnitCourse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class.");
    }

    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() throws Exception {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPositions(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    //ABCD=>false, ABAB=>true, AB=>true, A=>false
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() throws Exception {
        //fail("nishi failed!");
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }


    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() throws Exception {
        //fail("nishi failed!");
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }


    @AfterClass
    public static void afterClass(){
        System.out.println("After class.");
    }


}