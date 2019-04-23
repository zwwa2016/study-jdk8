package com.zhouwei.study.jdk.def;

/**
 * 接口默认方法
 * @author zhouwei
 * @create 2019-04-21
 */
public interface InterfaceDefaultService {

    /**
     * 接口的传统方法
     */
    void test();

    /**
     * 接口的静态方法
     */
    static void staticMethod(){
        System.out.println("接口的static方法");
    }

    default void defaulteMehtod(){
        System.out.println("接口的default方法");
    }

}
