package com.java8.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by zhiqiang.zhao on 2016/12/26.
 */
public class DateTimeLocal {

    public static void main(String[] args) {
        DateTimeLocal dateTimeLocal = new DateTimeLocal();
//        dateTimeLocal.testLocalDateTime(2016, 12, 25, 22, 58, 56);
//        dateTimeLocal.testLocalDateTime("2016-12-24 22:54:50");
        dateTimeLocal.testLocalDateTime();
    }

    public void testLocalDateTime(int year, int month, int day, int hour, int minute, int second){

        LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        System.out.println(localDateTime);
    }

    public void testLocalDateTime(String date){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
        LocalDateTime localDateTime = LocalDateTime.parse(date, df);
        System.out.println(localDateTime.format(df));
    }

    public void testLocalDateTime(){

        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime.plusDays(1));

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        //12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

    }

}
