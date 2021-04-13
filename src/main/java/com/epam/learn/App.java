package com.epam.learn;

import com.epam.learn.service.Range;

public class App {

    public static final String MESSAGE = "Check if %s is in range [%s - %s]: %s";

    public static void main(String[] args) {
        int value = 15;
        System.out.println(
                String.format(MESSAGE, value,  Range.getStartNumber(), Range.getEndNumber(), Range.check(value)));
    }
}
