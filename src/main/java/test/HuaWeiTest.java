/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: HuaWeiTest
 * Author:   gaozhen
 * Date:     2020/3/28 13:25
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toList;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class HuaWeiTest {

    public static void main(String[] args) {
        // 用户输入
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();

        // 获取输入范围内质数集合
        List<Long> primeNumberList = getAllPrimeNumberByRange(Long.valueOf(low), Long.valueOf(high));

        // 计算要求中最小值
        int minSum = getMinSum(primeNumberList);

        System.out.println(minSum);
    }

    /**
     * 〈根据入参质数范围，获取该范围内的所有质数集合〉<br>
     * 〈功能详细描述〉
     *
     * @return
     * @Param
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     **/
    private static List<Long> getAllPrimeNumberByRange(Long low, Long high) {
        return LongStream.rangeClosed(low, high).filter(num -> isPrime(num)).boxed().collect(toList());
    }

    /**
     * 〈判断一个数是否为质数〉<br>
     * 〈功能详细描述〉
     *
     * @Param
     * @return
     * @author
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     **/
    private static boolean isPrime(Long number) {
        return LongStream.range(2, number).noneMatch(i -> number % i == 0);
    }

    /**
     * 〈在质数集合中，输入题目条件要求的十位数和个位数之和的最小值〉<br>
     * 〈功能详细描述〉
     *
     * @return
     * @Param
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     **/
    private static int getMinSum(List<Long> primeNumberist) {
        // 如果质数集合为空，返回0
        if (null == primeNumberist || primeNumberist.size() == 0) {
            return 0;
        }
        int shiPositionSum = 0, gePositionSum = 0;
        for (Long prime : primeNumberist) {
            // 这块有很多方法，比如截取，取余等
            // 通过转换字符数据组的这种形式，看起来是较简单的
            char[] chars = String.valueOf(prime).toCharArray();

            String gePosition = Character.toString(chars[chars.length - 1]);
            String shiPosition = chars.length > 2 ? Character.toString(chars[chars.length - 2]) : "0";

            gePositionSum += Integer.valueOf(gePosition);
            shiPositionSum += Integer.valueOf(shiPosition);
        }

        // 返回其中小值
        return shiPositionSum < gePositionSum ? shiPositionSum : gePositionSum;
    }
}
