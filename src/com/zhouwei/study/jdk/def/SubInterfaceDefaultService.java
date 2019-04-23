package com.zhouwei.study.jdk.def;

/**
 * 测试子接口是否能继承重写default方法--子接口
 * @author zhouwei
 * @create 2019-04-21
 */
public interface SubInterfaceDefaultService extends InterfaceDefaultService {

    @Override
    default void defaulteMehtod() {
        System.out.println("这里是子类");
        //父类方法调用
        InterfaceDefaultService.super.defaulteMehtod();
    }
}
