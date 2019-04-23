package com.zhouwei.study.jdk;

import com.zhouwei.study.jdk.def.SubInterfaceDefaultServiceImpl;
import com.zhouwei.study.jdk.lambdaLearning.LambdaLearningPrintService;
import com.zhouwei.study.jdk.lambdaLearning.LambdaLearningSumService;
import com.zhouwei.study.jdk.lambdaLearning.LambdaLearningSumServiceImpl;
import com.zhouwei.study.jdk.lambdaLearning.LambdaLearningTestService;

/**
 * main方法测试
 * @author zhouwei
 * @create 2019-04-21
 */
public class Main {

    /**
     * default关键词测试
     */
    private static void testDefaultMethod(){
        SubInterfaceDefaultServiceImpl subInterfaceDefaultMethod = new SubInterfaceDefaultServiceImpl();
        subInterfaceDefaultMethod.defaulteMehtod();
    }

    /**
     * 测试传统实现类的方式
     */
    private static  void testTraditionImpl(){
        LambdaLearningSumService lambdaLearningSumService = new LambdaLearningSumServiceImpl();
        System.out.println(lambdaLearningSumService.sum(111,222));
    }

    /**
     * 测试匿名内部类的写法
     * 使用的时候创建对象
     */
    private static void testInnerImpl(){
        LambdaLearningSumService lambdaLearningSumService = new LambdaLearningSumService() {
            @Override
            public int sum(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println(lambdaLearningSumService.sum(111,222));
    }

    /**
     * 使用lambda表达式
     * 基本用法 两个参数
     */
    private static void testLambdaBasicUse(){
        LambdaLearningSumService lambdaLearningSumService = (int num1, int num2) ->{
            return num1 + num2;
        };

        System.out.println(lambdaLearningSumService.sum(111,222));
    }

    /**
     * 使用lambda表达式
     * 基本用法的简写 两个参数
     * 1.形参中的数据类型可以不写
     * 2.如果方法体重的代码只有一句，则可以省略{}，如果是return返回数据的，可以省略掉return
     */
    private static void testLambdaBasicUseShort(){
        LambdaLearningSumService lambdaLearningSumService = (num1, num2) -> num1 + num2;
        System.out.println(lambdaLearningSumService.sum(111,222));
    }

    /**
     * 使用lambda表达式
     * 基本用法 一个参数 无返回
     */
    private static void testLambdaBasicUseWithOneParam(){
        LambdaLearningPrintService lambdaLearningPrintService = str -> System.out.println(str);
        lambdaLearningPrintService.print("哈哈哈");
    }


    /**
     * 使用lambda表达式
     * 基本用法 无参数 无返回
     */
    private static void testLambdaBasicUseWithoutParam(){
        LambdaLearningTestService lambdaLearningTestService = () -> System.out.println("哈哈哈哈哈哈哈");
        lambdaLearningTestService.test();
    }

    public static void main(String[] args){
        testLambdaBasicUseWithoutParam();
    }
}
