package com.epam.learn.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RangeTestJunit4 {
    public static final String MESSAGE = "Check if %s is in range: %s";

    private final boolean expectedResult;
    private final int value;

    public RangeTestJunit4(boolean expectedResult, int value) {
        this.expectedResult = expectedResult;
        this.value = value;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, 15},
                {true, 19},
                {true, 11},
                {false, 10},
                {false, 20},
                {false, 200},
                {false, -1},
                {false, 1}
        });
    }

    @Test
    public void check() {
        boolean actualResult = Range.check(value);
        System.out.println(String.format(MESSAGE, value,  actualResult));
        assertEquals(actualResult, expectedResult);
    }
}
