package com.java8.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by zhiqiang.zhao on 2016/12/26.
 */
public class DateTimeZoned {

    public static void main(String[] args) {
        DateTimeZoned dateTimeZoned = new DateTimeZoned();
//        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
//        Date date = dateTimeZoned.defaultDateUtil("2016-12-29 08:59:59", timeZone);
//        dateTimeZoned.defaultDateUtil(date, TimeZone.getTimeZone("Asia/Shanghai"));
//        dateTimeZoned.defaultDateUtil2(date, TimeZone.getTimeZone("Asia/Shanghai"));
//        //ZonedDateTime
        ZoneId id = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = dateTimeZoned.testZonedDateTime("2016-12-25 08:59:59", id);
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime1);
    }

    public Date defaultDateUtil(String dateTime, TimeZone timeZone) {
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        isoFormat.setTimeZone(timeZone);
        try {
            Date date = isoFormat.parse(dateTime);
            System.out.println(date);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void defaultDateUtil(Date dateTime, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.setTime(dateTime);
        System.out.println(calendar.getTime());
    }

    public void defaultDateUtil2(Date dateTime, TimeZone timeZone) {
        DateFormat instance = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        instance.setTimeZone(timeZone);
        System.out.println(instance.format(dateTime));
    }


    public ZonedDateTime testZonedDateTime(String dateTime, ZoneId zoneId){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("u-M-d H:m:s");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, df);
        ZonedDateTime zoned = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zoned);
        return zoned;
    }
}
