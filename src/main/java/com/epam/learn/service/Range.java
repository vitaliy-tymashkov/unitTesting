package com.epam.learn.service;

public class Range {
    private static int startNumber = 10;
    private static int endNumber = 20;

    public static boolean check(int value){
        return (value > startNumber && value < endNumber);
    }

    public static boolean check(int value, boolean includeStart, boolean includeEnd){
        return ((value > startNumber) || (value == startNumber))
                && ((value < endNumber) || (value == endNumber));
    }

    public static int getStartNumber() {
        return startNumber;
    }

    public static int getEndNumber() {
        return endNumber;
    }
}
