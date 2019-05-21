package com.zamiur.ratul.hotel.utils;

public class NumberUtils {
    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }
}
