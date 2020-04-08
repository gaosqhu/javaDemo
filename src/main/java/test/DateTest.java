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

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;

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
    }

}
