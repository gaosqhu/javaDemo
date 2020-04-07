/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test7
 * Author:   gaozhen
 * Date:     2020/2/25 13:24
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.stream.IntStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test7 {
    public static void main(String[] args) {
        int[]a={1,2,3,4};
        int sum = IntStream.of(a).reduce(1, Integer::sum);
        System.out.println(sum);
    }

}
