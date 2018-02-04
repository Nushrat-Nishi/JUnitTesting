package com.nishi.jUnitCourse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MathTest {

    Reader readerMock = mock(Reader.class);
    com.nishi.jUnitCourse.Math math = new com.nishi.jUnitCourse.Math(readerMock);

    @Test
    public void addNormalPositiveScenario() throws Exception {

        assertEquals(5, math.add(4, 1));
    }

    @Test
    public void addNormalNegativeScenario() throws Exception {
        assertEquals(-5, math.add(-4, -1));
    }

    @Test
    public void isUserSelectionEven() throws Exception {

        when(readerMock.userSelection()).thenReturn(4);
        assertTrue(math.isUserSelectionEven());

        when(readerMock.userSelection()).thenReturn(5);
        assertFalse(math.isUserSelectionEven());
    }
}