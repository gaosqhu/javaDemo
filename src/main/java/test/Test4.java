/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test4
 * Author:   gaozhen
 * Date:     2020/2/25 8:03
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
public class Test4 {

    public static void main(String[] args) {
        String[] arr = { "hello", "world", "hello" };
        List<String[]> list1 = Arrays.stream(arr).map(tem -> tem.split("")).collect(toList());
        System.out.println(list1);
        List<Stream<String>> list2 = list1.stream().map(Arrays::stream).collect(toList());
        System.out.println(list2);
        List<String> list3 = list1.stream().flatMap(Arrays::stream).distinct().collect(toList());
        System.out.println(list3);

        List<String> lisct4 = Arrays.stream(arr).map(s -> s.split("")).flatMap(Arrays::stream).distinct()
                .collect(toList());
    }

}
