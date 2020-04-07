/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test3
 * Author:   gaozhen
 * Date:     2020/2/24 20:27
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("te1", "test2", "ts3");

        List<Integer> len= mapMy(list1,s->s.length());
        System.out.println(len);
    }

    private static <T, R> List<R> mapMy(List<T> list, Function<T, R> f) {
        List<R> res = new ArrayList<>();
        for (T t : list) {
            res.add(f.apply(t));
        }
        return res;
    }

}
