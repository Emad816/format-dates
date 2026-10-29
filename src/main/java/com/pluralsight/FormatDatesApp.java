package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        //formatting the date to 10/29/2026
        DateTimeFormatter usaDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //formatting the date to 2026/10/29
        DateTimeFormatter arika = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //prints day name, month name day of month, year
        DateTimeFormatter k1 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");

        //prints day name, month name day of month, year time
        DateTimeFormatter k2 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy  HH:mm");
        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));

        System.out.println(now.format(usaDate));
        System.out.println(now.format(arika));
        System.out.println(now.format(k1));
        System.out.println(now.format(k2));
    }

}
