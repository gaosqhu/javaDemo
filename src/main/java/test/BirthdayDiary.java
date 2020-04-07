/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: BirthdayDiary
 * Author:   gaozhen
 * Date:     2020/4/7 17:30
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BirthdayDiary {

    private Map<String, LocalDate> birdays;

    public BirthdayDiary() {
        birdays = new HashMap<>();
    }

    public static void main(String[] args) {
        BirthdayDiary diary = new BirthdayDiary();
        diary.addBirthday("t1", 12, 4, 1987);
        diary.addBirthday("t2", 12, 5, 2000);
        diary.addBirthday("t3", 12, 5, 1989);
        LocalDate l1 = diary.getBirthdayFor("t1");
        System.out.println(l1);
        int l2 = diary.getAgeInYear("t1", 2020);
        System.out.println(l2);

        Set<String> l3 = diary.getFriendsOfAgeIn(33, 2020);
        System.out.println(l3);

        int l4 = diary.getDaysUntilBirthday("t1");
        System.out.println(l4);

        Set<String> l5 = diary.getBirthdayInMonth(LocalDate.now().getMonth());
        System.out.println(l5);
        int l6 = diary.getTotalAgeInYears();
        System.out.println(l6);

    }

    // -------------------------------------------------------------------------------//
    public LocalDate addBirthday(String name, int day, int monnth, int year) {
        LocalDate birthday = LocalDate.of(year, monnth, day);
        birdays.put(name, birthday);
        return birthday;
    }

    public LocalDate getBirthdayFor(String name) {
        return birdays.get(name);
    }

    public int getAgeInYear(String name, int year) {
        Period period = Period.between(birdays.get(name), birdays.get(name).withYear(year));
        return period.getYears();
    }

    public Set<String> getFriendsOfAgeIn(int age, int year) {
        return birdays.keySet().stream().filter(p -> getAgeInYear(p, year) == age).collect(Collectors.toSet());
    }

    public int getDaysUntilBirthday(String name) {
        Period period = Period.between(LocalDate.now(), birdays.get(name));
        return period.getDays();
    }

    public Set<String> getBirthdayInMonth(Month month) {
        return birdays.entrySet().stream().filter(p -> p.getValue().getMonth() == month).map(p -> p.getKey())
                .collect(Collectors.toSet());
    }

    public Set<String> getBirthdayInNextMonth() {
        return getBirthdayInMonth(LocalDate.now().getMonth());
    }

    public int getTotalAgeInYears() {
        return birdays.keySet().stream().mapToInt(p -> getAgeInYear(p, LocalDate.now().getYear())).sum();
    }
}
