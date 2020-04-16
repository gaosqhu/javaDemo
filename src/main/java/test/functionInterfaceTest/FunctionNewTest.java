/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: FunctionNewTest
 * Author:   gaozhen
 * Date:     2020/4/16 9:34
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
public class FunctionNewTest {
    public static <T, R> List<R> functionProcessor(List<T> list, FunctionNew<T, R> function) {
        return list.stream().map(t -> function.apply(t)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("t", "l", "k");
        List<String> result = functionProcessor(list, t -> t + "prexx");
        System.out.println(result);
    }
}
