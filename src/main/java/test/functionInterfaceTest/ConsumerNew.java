/*
 * Copyright (C), 2002-2020, sn限公司
 * FileName: ConsumerNew
 * Author:   gaozhen
 * Date:     2020/4/16 9:19
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test.functionInterfaceTest;

/**
 * 〈除了predicate,consumer,function3个接口，还有对应的原始类型特化的函数式接口〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@FunctionalInterface
public interface ConsumerNew<T> {
    void accept(T t);
}
