package com.jikaigg.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
*
* */
public class JacksonTest {
    // java对象转json
    @Test
    public void test1() throws Exception {
        Person p = new Person();
        p.setName("yaojikai");
        p.setAge(18);
        p.setGender(true);
        //创建Jackson核心对象
        ObjectMapper map = new ObjectMapper();
        /*
        * 转换
        * 方法：
        *   WriteValue(参数1,obj)：
        *       参数1：
        *           File:将obj转换为JSON字符串，并保存到指定文件中
        *           write:将obj转换为JSON字符串，并将json填充到字符输出流中
        *           OutputStream:将obj转换为JSON字符串，并将json填充到字节输出流中
        *   WriteValueAsString(obj)：将对象转换为json字符串
        *
        * */
        String s = map.writeValueAsString(p);
        System.out.println(s);    // {"name":"yaojikai","age":18,"gender":true}

        map.writeValue(new File("d:\\a.txt"),p);    // 将json字符串保存到d盘的a.txt文件中
        map.writeValue(new FileWriter("D:\\b.txt"),p);
    }
}
