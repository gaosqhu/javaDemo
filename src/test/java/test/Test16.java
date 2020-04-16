/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: Test16
 * Author:   gaozhen
 * Date:     2020/4/15 21:47
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test16 {
    @Test
    public void test01() {
        int i = 2;
        Runnable r = () -> System.out.println(i);
        // i =4;
    }

    @Test
    public void test02() {
        List<String> list = Arrays.asList("b", "a", "c");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }

}
