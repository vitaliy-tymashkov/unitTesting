package com.epam.learn.service;

import static com.epam.learn.service.Range.checkIfValueIsInRange;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;


class RangeTestJunit5 {
    public static final String MESSAGE = "Check if %s is in range: %s";

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testCheck_WhenInRange_ThenReturnTrue() {
        boolean expectedResult = true;
        int value = 15;

        //When
        boolean actualResult = Range.checkIfValueIsInRange(value);
        System.out.println(String.format(MESSAGE, value,  actualResult));

        //Then
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(true, 15),
                Arguments.of(false, 10),
                Arguments.of(false, 20)
        );
    }
}
