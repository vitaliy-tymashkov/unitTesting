package com.epam.learn;

import com.epam.learn.service.Range;

public class App {
    private static String tmp;
    public static final String MESSAGE = "Check if %s is in range [%s - %s]: %s";

    public static void main(String[] args) {
        int value = 15;
        System.out.println(
                String.format(MESSAGE, value,  Range.getStartNumber(), Range.getEndNumber(), Range.checkIfValueIsInRange(value)));

        checkNpe();
    }

    private static void checkNpe() {
        if ("some text".equals(tmp)){
            System.out.println("Null Pointer not happened - will not execute");
        } else {
            System.out.println("Null Pointer not happened");
        }
    }
}
