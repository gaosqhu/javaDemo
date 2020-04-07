/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test10
 * Author:   gaozhen
 * Date:     2020/2/25 20:28
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test10 {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> dd = IntStream.range(100, 200).boxed()
                .collect(Collectors.partitioningBy(i -> isPrime(i)));
        System.out.println(dd);
    }

    public static boolean isPrime(int number) {
        return IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }

}
