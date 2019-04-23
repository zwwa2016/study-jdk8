package com.zhouwei.study.jdk.methodRef;


/**
 * 用户对象
 * @author zhouwei
 * @create 2019-04-23
 */
public class Person {

    private String id;

    private String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
