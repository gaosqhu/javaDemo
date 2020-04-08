/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: DateTest
 * Author:   gaozhen
 * Date:     2020/4/7 21:04
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.firstDayOfNextMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DateTest {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);

        LocalDate d2 = LocalDate.of(2020, 4, 7);
        System.out.println(d2);
        System.out.println(d2.getYear());
        System.out.println(d2.getMonth());
        System.out.println(d2.getDayOfMonth());
        System.out.println(d2.getDayOfWeek());
        System.out.println(d2.lengthOfMonth());
        System.out.println(d2.isLeapYear());
        System.out.println(d2.get(ChronoField.YEAR));

        LocalTime d3 = LocalTime.of(21, 22, 45);
        System.out.println(d3.getHour());
        System.out.println(d3.getMinute());
        System.out.println(d3.getSecond());

        LocalDate d4 = LocalDate.parse("2020-04-07");
        System.out.println(d4);
        LocalTime d5 = LocalTime.parse("21:03:45");
        System.out.println(d5);
        System.out.println(Instant.now().getLong(ChronoField.MILLI_OF_SECOND));

        LocalDate d6 = LocalDate.of(2020, 4, 7);
        LocalDate d7 = LocalDate.of(2020, 3, 23);
        Period d8=Period.between(d6,d7);
        System.out.println(d8);

        // Duration dd=Duration.between(d6,d7);

        LocalDate d9 = LocalDate.parse("2020-04-07", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(d9);

        LocalTime d10 = LocalTime.now();
        LocalDateTime d11 = LocalDate.now().atTime(d10);
        System.out.println(d11);

        LocalDate d12 = d11.toLocalDate();
        System.out.println(d12);

        LocalDateTime d13 = LocalDateTime.now();
        LocalDateTime d14 = LocalDateTime.of(2020, 04, 8, 07, 00, 00);
        Duration d15 = Duration.between(d13, d14);
        System.out.println(d15);

        Duration d16 = Duration.ofMinutes(3);
        System.out.println(d16);

        Period d17 = Period.ofDays(10);
        System.out.println(d17);

        LocalDate d18 = LocalDate.of(2020, 04, 20);
        LocalDate d181 = d18.withYear(2021);
        LocalDate d182 = d18.withDayOfMonth(25);
        LocalDate d183 = d18.withMonth(12);
        System.out.println(d18);
        LocalDate d184 = d18.with(ChronoField.MONTH_OF_YEAR, 5);
        System.out.println(d184);

        LocalDate d19 = LocalDate.of(2020, 04, 8);
        LocalDate d191 = d19.with(nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(d191);
        LocalDate d192 = d19.with(lastDayOfMonth());
        System.out.println(d192);
        LocalDate d193 = d19.with(dayOfWeekInMonth(1, TUESDAY));
        System.out.println(d193);
        System.out.println(d19.with(firstDayOfMonth()));
        System.out.println(d19.with(firstDayOfNextMonth()));
        System.out.println(d19.with(TemporalAdjusters.firstDayOfNextMonth()));
    }

}
