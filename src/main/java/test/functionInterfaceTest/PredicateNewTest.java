/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: PredicateNewTest
 * Author:   gaozhen
 * Date:     2020/4/16 9:02
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test.functionInterfaceTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PredicateNewTest {

    public static <T> List<T> predicateProcessor(List<T> list, PredicateNew<T> pred) {
        return list.stream().filter(t -> pred.test(t)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("temp", "d");
        List<String> result = predicateProcessor(list, s -> s.length() > 2);
        System.out.println(result);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Integer> result2 = predicateProcessor(list2, i -> i > 2);
        System.out.println(result2);
    }
}
