/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: DateU
 * Author:   gaozhen
 * Date:     2020/4/8 10:25
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class DateU {
    public static TemporalAdjuster nextWorkingDay = TemporalAdjusters.ofDateAdjuster(temporal -> {
        int inveral = 1;
        DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        if (dow.equals(DayOfWeek.SATURDAY)) {
            inveral = 2;
        } else if (dow.equals(DayOfWeek.FRIDAY)) {
            inveral = 3;
        }
        return temporal.plus(inveral, ChronoUnit.DAYS);
    });

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.with(nextWorkingDay));
    }
}
