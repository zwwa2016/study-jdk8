package com.zhouwei.study.jdk.lambdaLearning;

/**
 * lambda表达式实现类
 * @author zhouwei
 * @create 2019-04-23
 */
public class LambdaLearningSumServiceImpl implements LambdaLearningSumService {

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
