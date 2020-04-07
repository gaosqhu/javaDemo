/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test8
 * Author:   gaozhen
 * Date:     2020/2/25 13:53
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import static java.util.Comparator.comparing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,1, 2, 3, 4, 5);
        int sum = list.stream().mapToInt(i -> i).sum();
        list.sort(comparing(Integer::intValue));

        System.out.println(sum);
        int max = list.stream().mapToInt(i -> i).max().orElse(1);
        System.out.println(max);
        // 多了装箱操作
        int sum2 = list.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        Long dd = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).count();
        System.out.println(dd);
    }

}
