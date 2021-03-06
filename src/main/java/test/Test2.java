/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test2
 * Author:   gaozhen
 * Date:     2020/2/24 20:06
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test2 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("te1", "test2", "ts3");
        // foreaceMy(list1, System.out::println);
        foreaceMy(list1, a -> System.out.println(a + "_gz"));
        System.out.println(list1);
    }

    private static <T> void foreaceMy(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }
}
