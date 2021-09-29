package com.learn.java.time;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DatetoLocalDateExample {
    public static void main(String[] args) {
        /*
        java.util date to local date8
         */
        Date date = new Date();
        System.out.println(date);
      LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);
    }
}
