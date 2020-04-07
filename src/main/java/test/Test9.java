/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test9
 * Author:   gaozhen
 * Date:     2020/2/25 18:47
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.stream.Stream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test9 {
    public static void main(String[] args) {
        //Stream.iterate(0,i->i+2).limit(10).forEach(System.out::println);
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(20).map(t->t[0]).forEach(System.out::println);

    }

}
