/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test12
 * Author:   gaozhen
 * Date:     2020/3/4 20:45
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import org.junit.Test;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test12 {

    @Test
    public void test01() {
        Map<Boolean, List<Integer>> z = IntStream.range(2, 160).boxed().collect(partitioningBy(this::isPrime));
        System.out.println(z);

    }

    /**
     * 〈一句话功能简述〉<br>
     * 〈功能详细描述〉
     *
     * @return
     * @Param
     * @author gaozhen
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     **/
    private boolean isPrime(int number) {
        int number2 = (int) Math.sqrt((double) number);
        return IntStream.range(2, number2).noneMatch(i -> number % i == 0);
    }

}
