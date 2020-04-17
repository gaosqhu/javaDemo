/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: OptionalUtils
 * Author:   gaozhen
 * Date:     2020/4/17 16:48
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class OptionalUtils {
    public static Optional<Integer> stringToInter(String s) {
        return Optional.ofNullable(Integer.parseInt(s));
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "1");
        map.put("key2", "22222");
        int i1 = Optional.ofNullable(map.get("key1")).flatMap(OptionalUtils::stringToInter).orElse(0);
        System.out.println(i1);
        int i2 = Optional.ofNullable(map.get("key2")).flatMap(OptionalUtils::stringToInter).orElse(0);
        System.out.println(i2);
    }

}
