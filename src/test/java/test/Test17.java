/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: Test17
 * Author:   gaozhen
 * Date:     2020/4/17 16:24
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;

/**
 * 〈过深的判断与过多的退出语句，都不可取〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Test17 {
    @Test
    public void test01() {
        ExecutorService exector = Executors.newCachedThreadPool();
        Future<Double> future = exector.submit(() -> {
            System.out.println("STEP 1");
            return 5.0D;
        });
        System.out.println("STEP 2");
        try {
            Double d1 = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("STEP 3");
    }
}
