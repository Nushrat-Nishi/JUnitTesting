package com.nishi.jUnitCourse;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysCompareTest {

    @Test
    public void testArraysSortRandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }


    @Test(expected = NullPointerException.class)
    public void testArraysSortNullRandomArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testSortPerformance(){
        int array[] = {12, 23, 4};

        for (int i=1; i<=1000000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
