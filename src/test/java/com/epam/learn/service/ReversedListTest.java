package com.epam.learn.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReversedListTest {

    private List<String> testedList;
    private List<String> expectedReversedList;

    @Before
    public void setUp() {
        testedList = Arrays.asList("one", "two", "three");
        expectedReversedList = Arrays.asList("three", "two", "one");
    }

    @Test
    public void shouldReverseListAndCheckIfItReversed(){
        List<String> actualReversedList = new ArrayList<>(testedList);
        Collections.reverse(actualReversedList);

        assertThat(actualReversedList)
                .isNotEmpty()
                .isNotSameAs(testedList)
                .isEqualTo(expectedReversedList);
    }

    @After
    public void tearDown(){
        testedList = null;
        expectedReversedList = null;
    }
}
