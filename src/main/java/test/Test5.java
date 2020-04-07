/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test5
 * Author:   gaozhen
 * Date:     2020/2/25 8:40
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test5 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("c", "d");
        List<Stream<String[]>> list3 = list1.stream().map(t -> list2.stream().map(k -> new String[] { t, k }))
                .collect(toList());
        System.out.println(list3);
        List<String[]> list4 = list1.stream().flatMap(t -> list2.stream().map(k -> new String[] { t, k }))
                .collect(toList());
        System.out.println(list4);

        List<Integer> list5 = Arrays.asList(1, 2);
        List<Integer> list6 = Arrays.asList(4, 5);
        List<Integer[]> list7 = list5.stream()
                .flatMap(i -> list6.stream().filter(j -> (i + j) % 3 != 0).map(j -> new Integer[] { i, j }))
                .collect(toList());
        System.out.println(list7);
    }

}
