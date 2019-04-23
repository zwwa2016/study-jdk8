package com.zhouwei.study.jdk.methodRef;

/**
 * 将string解析为int的接口
 * 用于测试静态方法引用
 * @author zhouwei
 * @create 2019-04-23
 */
@FunctionalInterface
public interface PraseInterface {
    int prase(String str);
}
