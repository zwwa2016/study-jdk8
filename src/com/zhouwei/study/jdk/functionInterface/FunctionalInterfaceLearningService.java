package com.zhouwei.study.jdk.functionInterface;


@FunctionalInterface
public interface FunctionalInterfaceLearningService {
    void funcText();

    /**
     * 接口的静态方法和default方法是可以存在的
     */
    static void staticMethod(){
        System.out.println("接口的static方法");
    }

    default void defaulteMehtod(){
        System.out.println("接口的default方法");
    }
}
