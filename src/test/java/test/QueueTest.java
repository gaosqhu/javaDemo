/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: QueueTest
 * Author:   gaozhen
 * Date:     2020/2/29 10:22
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
public class QueueTest {
    // 定义2个节点，头节点和尾节点
    Node head = null;
    Node tail = null;

    @Test
    public void queueTest() {
        // 放一个元素到队列
        putElement(12);
        // 从队队中取出
        Integer number = getElement();
        System.out.println(number);
    }

    /**
     * 〈一句话功能简述〉<br>
     * 〈功能详细描述〉
     *
     * @Param
     * @return
     * @author gaozhen
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     **/
    public void putElement(Integer data) {
        // 构造新节点
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            // 尾节点下个节点指向新节点
            tail.next = newNode;
            // 尾节点指向新节点
            tail = newNode;
        }
    }

    /**
     * 〈取出元素〉<br>
     * 〈功能详细描述〉
     *
     * @Param
     * @return
     * @author gaozhen
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     **/
    public Integer getElement() {
        // 头尾节点，不是队列
        if (head == tail) {
            return null;
        }
        // 取出头节点的下个元素
        int data = head.data;
        //指向下个节点
        head = head.next;
        return data;
    }
}
