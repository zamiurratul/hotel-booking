package com.zamiur.ratul.hotel.utils;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    public static Date getRandomDate(){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = (int) NumberUtils.getRandomIntegerBetweenRange(1900, 2010);
        gregorianCalendar.set(gregorianCalendar.YEAR, year);
        int dayOfYear = (int) NumberUtils.getRandomIntegerBetweenRange(1, gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_YEAR));
        gregorianCalendar.set(gregorianCalendar.DAY_OF_YEAR, dayOfYear);

        return gregorianCalendar.getTime();
    }
}
