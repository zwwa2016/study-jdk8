环境：jdk1.8及以上


Java 1.8 新特性
主要包括:



一、接口默认方法
1.1 传统的方法(test())
   接口中可以存在 抽象方法

1.2 接口的static方法(staticMethod())
   1.2.1使用static修饰接口中的方法并且必须得有主体
   1.2.2接口的static方法只能够被接口本身调用：接口.方法（）
   1.2.3接口的static方法不能够被子接口继承
   1.2.4接口的static方法不能够被实现类重写及直接调用

1.3 default方法
   1.3.1使用default关键字修饰
   1.3.2可以被子接口继承、重写、直接调用


二、函数式接口
   有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。函数式接口可以被隐式转换为lambda表达式
   2.1 @FunctionalInterface可以用来修饰函数式接口，且一旦用该注释修饰，则一定有且仅有一个抽象方法

三、Lambda表达式
   3.1.Lambda表达式实际本质是匿名内部类，故lambda表达式中引用的变量其实默认加了final
   3.2.对于函数式接口均可以使用lambda表达式来写实现类，这样的实现类不用显式new出来，而是在lambda表达式运行时实例化出来

   3.3lambda表达式的相关测试可见Main.java中的
   3.3.1.基础测试：testLambdaBasicUse();
   3.3.2.简化写法测试：testLambdaBasicUseShort();
   3.3.3 一个参数无返回：testLambdaBasicUseWithOneParam()；
   3.3.4 无参无返回：testLambdaBasicUseWithoutParam();
