/*
 * Copyright (C), 2002-2020, sn限公司
 * FileName: BufferProcsserReaderIntf
 * Author:   gaozhen
 * Date:     2020/4/15 21:48
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface BufferProcsserReaderIntf {
    String process(BufferedReader r) throws IOException;
}
