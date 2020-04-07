/*
 * Copyright (C), 2002-2020, 苏宁易购电子商务有限公司
 * FileName: Test2
 * Author:   gaozhen
 * Date:     2020/1/19 11:44
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author gaozhen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class GroovyTest {
    public static void main(String[] args) {

        // 得到javascript脚本引擎
        ScriptEngineManager manager = new ScriptEngineManager();

        ScriptEngine scriptEngine = manager.getEngineByName("groovy");
        // 定义脚本和数据

        String script = "userNo!=null?'Y':'N'";
        String script1 = "if(userNo.is('123')){'1'}else if(userNo.is('234')){'2'} else{'3'}";
        String script2 = "if(userNo.is('123')&&custNo.is('abc')){'匹配'}else {'未匹配'}";

        String userNo = "123";
        String custNo = "abc";

        // 初始化引擎数据

        Bindings variables = scriptEngine.createBindings();
        Map<String, String> dataMap = new HashMap();
        dataMap.put("userNo", userNo);
        dataMap.put("custNo", custNo);
        variables.putAll(dataMap);

        // 初始化script
        Map<String, String> scriptMap = new HashMap();
        scriptMap.put("isOpen", script);
        scriptMap.put("ifTest", script1);
        scriptMap.put("ifJoin", script2);

        // 判断
        int ee = 1;
        for (int i = 1; i <= 10; i++) {
            Map<String, Object> resMap = new HashMap<>();

            Long time = System.currentTimeMillis();
            scriptMap.forEach((k, v) -> {

                try {

                    String value = (String) scriptEngine.eval(v, variables);

                    resMap.put(k, value);
                } catch (ScriptException e) {
                    e.printStackTrace();
                }

            });
            System.out.println("第" + ee + "次:" + (System.currentTimeMillis() - time) + "ms");
            ee++;
            System.out.println(resMap);
        }

        // for (int i = 1; i <= 10; i++) {
        // ScriptEngine engine = new ScriptEngineManager().getEngineByName("groovy");
        // Compilable compilable = (Compilable) engine;
        // String scrip3t = "userNo2!=null?'Y':'N'";
        // String scrip4t = "if(userNo2.is('123')){'1'}else if(userNo2.is('234')){'2'} else{'3'}";
        //
        // List<CompiledScript> list = new ArrayList<>();
        // String userNo2 = null;
        // try {
        // CompiledScript groovyFunction1 = compilable.compile(scrip3t);
        // list.add(groovyFunction1);
        // CompiledScript groovyFunction2 = compilable.compile(scrip4t);
        // list.add(groovyFunction2);
        // userNo2 = "123";
        // } catch (ScriptException e) {
        // e.printStackTrace();
        // }
        // Bindings variables2 = engine.createBindings();
        // variables2.put("userNo2", userNo2);
        //
        // list.forEach(it -> {
        // try {
        // String result = (String) it.eval(variables2);
        // System.out.println(result);
        // } catch (ScriptException e) {
        // e.printStackTrace();
        // }
        // });
        // }


    }
}