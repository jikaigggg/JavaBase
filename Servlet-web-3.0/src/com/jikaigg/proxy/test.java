package com.jikaigg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) {
        // 创建对象
        lenovo lenovo = new lenovo();

        //动态代理增强lenovo对象
        /*
        * 三个参数：
        *   类加载器：真实对象.getClass().getClassLoader()
        *   接口数组：真实对象.getClass().getInterfaces()
        *   处理器 new InvocationHandler()
        * */
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
            * 代理逻辑编写的方法：代理对象调用的所有方法都会触发该方法执行
            *   参数：
            *       1.proxy：代理对象
            *       2.method：代理对象调用的方法被封装为的对象
            *       3.args：代理对象调用方法时传递的实际参数
            * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("helloworld");
                return null;
            }
        });

        // 调用方法
        String sale = proxy_lenovo.sale(100);
        System.out.println(sale);
    }
}
