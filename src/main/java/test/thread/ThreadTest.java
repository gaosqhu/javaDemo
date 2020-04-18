/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: ThreadTest
 * Author:   gaozhen
 * Date:     2020/4/18 14:32
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ThreadTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Long start = System.currentTimeMillis();
        Future<Double> future = shop.getPriceAsync("my favorite product");
        Long time = System.currentTimeMillis() - start;
        System.out.println("do something else");
        try {
            double price = future.get();
            System.out.println(price);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Long time2 = System.currentTimeMillis() - start;
        System.out.println("time1:" + time + " ,time2:" + time2);
    }

}
