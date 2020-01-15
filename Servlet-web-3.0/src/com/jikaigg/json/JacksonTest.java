package com.jikaigg.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    /*
    * ​	@JsonIgnore：忽略该属性
    *   @JsonFormat：属性格式化
    * */
    @Test
    public void test2() throws Exception {
        Person p = new Person();
        p.setName("yaojikai");
        p.setAge(18);
        p.setGender(true);
        p.setBirthday(new Date());
        //创建Jackson核心对象
        ObjectMapper map = new ObjectMapper();
        String s = map.writeValueAsString(p);
        System.out.println(s);    // {"name":"yaojikai","age":18,"gender":true,"birthday":1579091354165}
    }

    @Test
    public void test3() throws Exception {
        Person p1 = new Person();
        p1.setName("yaojikai");
        p1.setAge(18);
        p1.setGender(true);
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("shimengyu");
        p2.setAge(18);
        p2.setGender(false);
        p2.setBirthday(new Date());

        Person p3 = new Person();
        p3.setName("huangjiaju");
        p3.setAge(40);
        p3.setGender(true);
        p3.setBirthday(new Date());

        Person p4 = new Person();
        p4.setName("huangguanzhong");
        p4.setAge(55);
        p4.setGender(true);
        p4.setBirthday(new Date());

        List<Person> ll = new ArrayList<Person>();
        ll.add(p1);
        ll.add(p2);
        ll.add(p3);
        ll.add(p4);
        ObjectMapper map = new ObjectMapper();
        String s = map.writeValueAsString(ll);
        System.out.println(s);
    }
    // json转换为java对象
    @Test
    public void test4() throws Exception{
        // 1.初始化JSON字符串
        String json = "{\"name\":\"yaojikai\",\"age\":18,\"gender\":true,\"birthday\":1579091354165}";
        // 2.创建ObjectMapper对象
        ObjectMapper map = new ObjectMapper();
        // 3.转换为java对象Person对象
        Person p = map.readValue(json,Person.class);
        System.out.println(p);
    }
}
