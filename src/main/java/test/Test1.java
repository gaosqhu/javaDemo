/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test1
 * Author:   gaozhen
 * Date:     2020/2/24 16:42
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("te1", "test2", "ts3",null);
       // List<String> res1 = filter(list1, a -> a.length() > 3);
        // System.out.println(res1);

        List<Integer> list2 = Arrays.asList(10, 16, 20);
        List<Integer> res2 = filter(list2, a -> (a > 10 && a < 20));
        filter(list2, (Integer i) -> i % 2 == 0);
        // System.out.println(res2);
        IntPredicate dd = (int i) -> i % 2 == 0;
        boolean dds = dd.test(1000);
        // System.out.println(dds);

        List<String> list3 = Arrays.asList("tfe1", "ftfest2", "ts3");
        Map<String, String> ddsf = filter2(list1, s -> list3.contains(s));
        System.out.println(ddsf);

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    private static <T> Map<T, String> filter2(List<T> list, Predicate<T> p) {
        Map<T, String> result = new HashMap<>();
        for (T t : list) {
            if ( p.test(t)) {
                result.put(t, "Y");
            } else {
                result.put(t, "N");
            }
        }
        return result;
    }
}
