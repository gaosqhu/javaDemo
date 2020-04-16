/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: Test15
 * Author:   gaozhen
 * Date:     2020/4/15 14:26
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test15 {
    public void test01() {
        File[] f = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });

        File[] f2 = new File(".").listFiles(File::isHidden);
    }

    public void test02() {
        // List<String> l=new ArrayList<>();
        // filter(l,a->a.len);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    @Test
    public void test03() {
        // 行为参数化
        Thread t = new Thread(() -> System.out.println("ee"));
        Thread t1 = new Thread(() -> System.out.println("eee3"));
        t.start();
        t1.start();
    }
}
