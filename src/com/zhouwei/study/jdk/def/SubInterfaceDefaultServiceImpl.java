package com.zhouwei.study.jdk.def;

/**
 * 测试子接口是否能继承重写default方法 -- 实现类
 * @author zhouwei
 * @create 2019-04-21
 */
public class SubInterfaceDefaultServiceImpl implements SubInterfaceDefaultService {
    @Override
    public void defaulteMehtod() {
        System.out.println("这里是子类的实现类");
        SubInterfaceDefaultService.super.defaulteMehtod();
    }

    @Override
    public void test() {

    }
}
