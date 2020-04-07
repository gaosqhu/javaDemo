/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test13
 * Author:   gaozhen
 * Date:     2020/3/15 16:46
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import org.junit.Test;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test13 {
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
    @Test
    public void test() {
        System.out.println("success");
    }

    @Test
    public void test01() {
        String tmp = "dfgHlkl";
        boolean flag = false;
        for (int i = 0, len = tmp.length(); i < len; i++) {
            if (Character.isUpperCase(tmp.charAt(i))) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

    @Test
    public void test02() {
        String tmp = "dfgHlkl";
        boolean flag = tmp.chars().anyMatch(i -> Character.isUpperCase(i));
        System.out.println(flag);
        tmp.length();
        String[] dd={"d"};
        int a=dd.length;
    }
}
