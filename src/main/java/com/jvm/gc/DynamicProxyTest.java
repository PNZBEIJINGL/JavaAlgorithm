package com.jvm.gc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    interface IHello {
        void sayHello(String name);
    }

    static class Hello implements IHello {
        @Override
        public void sayHello(String name) {
            System.out.println("hello, "+name);
        }
    }

    static class DynamicProxy implements InvocationHandler {

        Object originalObj; //真实处理对象

        /**
         * @param originalObj  真实处理对象
         * @return
         */
        Object bind(Object originalObj) {
            this.originalObj = originalObj;
            //通过Proxy类的newProxyInstance方法创建代理对象,返回一个实现了IHello接口的代理对象实例,
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(), originalObj.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            //TODO: 真实对象处理前增加某个操作
            System.out.println("before invoke...");
            Object object= method.invoke(originalObj, args);
            //TODO: 真是对象处理后增加某个操作
            System.out.println("before invoke...");

            return object;
        }
    }

    public static void main(String[] args) {
        //
        IHello hello = (IHello) new DynamicProxy().bind(new Hello());
        hello.sayHello("zhang san");

    }
}
