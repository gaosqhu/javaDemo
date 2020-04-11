/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: Test11
 * Author:   gaozhen
 * Date:     2020/4/11 10:12
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test11 {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2020-01-12");
        System.out.println(d1);

        LocalDate d2 = LocalDate.of(2020, 01, 20);
        String d3 = d2.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(d3);

        LocalDate d4 = LocalDate.parse(d3, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(d4);

        LocalDateTime d5 = LocalDateTime.now();
        Long m = d5.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(m);

        Long m2 = Instant.now().toEpochMilli();
        Long m3 = Instant.now().getEpochSecond();
        System.out.println(m2);
        System.out.println(m3);

        MonthDay m4 = MonthDay.now();
        System.out.println(m4);
        LocalDate d6=LocalDate.of(2010,04,10);
        MonthDay m5=MonthDay.from(d6);
        System.out.println(m5.equals(m4));
        YearMonth y1 = YearMonth.now();
        System.out.println(y1);
    }
}
