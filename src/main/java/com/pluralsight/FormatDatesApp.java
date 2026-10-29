package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        //formatting the date to 10/29/2026
        DateTimeFormatter usaDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(usaDate));

        //formatting the date to 2026/10/29
        DateTimeFormatter arika = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(now.format(arika));

        //prints day name, month name day of month, year
        System.out.println(now.getDayOfWeek() + ", " + now.getMonth() +
                " " + now.getDayOfMonth() + ", " + now.getYear());

        //prints day name, month name day of month, year time
        System.out.println(now.getDayOfWeek() + ", " + now.getMonth() +
                " " + now.getDayOfMonth() + ", " + now.getYear() + "  " + now.getHour() + ":" + now.getMinute());
    }
}
