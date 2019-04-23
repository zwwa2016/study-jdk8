package com.zhouwei.study.jdk.methodRef;

/**
 * 用户工厂
 * @author zhouwei
 * @create 2019-04-23
 */
@FunctionalInterface
public interface PersonFactory {

    Person createPerson(String id,String name);
}
