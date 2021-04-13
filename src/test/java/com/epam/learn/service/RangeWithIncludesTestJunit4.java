package com.epam.learn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class RangeWithIncludesTestJunit4 {

    public static final String MESSAGE = "Check if %s is in range (include start and end): %s";

    public static final boolean INCLUDE_END = true;
    public static final boolean INCLUDE_START = true;

    private final boolean expectedResult;
    private final int value;

    public RangeWithIncludesTestJunit4(boolean expectedResult, int value) {
        this.expectedResult = expectedResult;
        this.value = value;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, 15},
                {true, 19},
                {true, 11},
                {true, 10},
                {true, 20},
                {false, 200},
                {false, -1},
                {false, 1}
        });
    }

    @Test
    public void check() {
        boolean actualResult = Range.check(value, INCLUDE_START, INCLUDE_END);
        System.out.println( String.format(MESSAGE, value,  actualResult));
        assertEquals(actualResult, expectedResult);
    }
}
