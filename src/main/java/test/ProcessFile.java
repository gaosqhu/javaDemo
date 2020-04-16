/*
 * Copyright (C), 2002-2020, sn有限公司
 * FileName: ProcessFile
 * Author:   gaozhen
 * Date:     2020/4/15 21:50
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ProcessFile {
    public static void main(String[] args) throws Exception {
        process(BufferedReader::readLine);
    }

    public static String process(BufferProcsserReaderIntf r) throws IOException {
        String dd = "";
        try (BufferedReader t = new BufferedReader(new FileReader(""))) {
            dd = r.process(t);
        }
        return dd;
    }
}
