/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: Test14
 * Author:   gaozhen
 * Date:     2020/4/11 17:02
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test14 {
    @Test
    public void test1() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.println("year:" + year + ",month:" + month + ",day:" + day);
        LocalDate date1 = LocalDate.of(2014, 01, 14);
        System.out.println(now.equals(date1));
    }

    @Test
    public void test2() {
        LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
        MonthDay birthday = MonthDay.from(dateOfBirth);
        LocalDate today = LocalDate.now();
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(birthday)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }
    }

    @Test
    public void test3() {
        LocalTime time = LocalTime.now();
        LocalTime time2 = time.plusHours(2);
        System.out.println(time2);

        LocalDate today = LocalDate.now();
        LocalDate d1 = today.plus(1, ChronoUnit.WEEKS);
        System.out.println(d1);
        LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
        System.out.println(previousYear);
        Clock clock = Clock.systemUTC();
        Long dd = clock.millis();
        System.out.println(dd);
    }

    @Test
    public void test4() {
        LocalDateTime d1 = LocalDateTime.now();
        LocalDateTime d2 = LocalDateTime.now().plus(1, ChronoUnit.DAYS);
        System.out.println(d1.isBefore(d2));

        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);

        YearMonth y1 = YearMonth.now();
        System.out.println(y1);
        YearMonth y2 = YearMonth.of(d1.getYear(), d1.getMonth());
        System.out.println(y2);
        System.out.println(y1.isBefore(y2));
        LocalDate d4 = LocalDate.now();
        System.out.println(d4.isLeapYear());

        LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 10);
        Period periodToNextJavaRelease = Period.between(java8Release, d4);
        System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.getMonths());

        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp);

        String dayAfterTommorrow = "20140116";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formatted);

        LocalDateTime arrivalDate = LocalDateTime.now();

        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy  hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at :  %s %n", landing);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }
    }

    @Test
    public void test5() {
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2020, 04, 10);
        Long dif = d1.toEpochDay();
        Long dif2 = d2.toEpochDay();
        System.out.println(dif - dif2);
        Period p=Period.between(d2,d1);
        System.out.println(p.getDays());
    }

    @Test
    public void test6() {
        boolean cond = false;
        Double d1 = 1D;
        Double d2 = 2D;
        Double d3 = null;
        double d5 = d1 * d2;
        Double d4 = cond ? d5 : d3;
        System.out.println(d4);
    }
}
