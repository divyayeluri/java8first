package com.learn.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    public static void main(String[] args) {
       LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
