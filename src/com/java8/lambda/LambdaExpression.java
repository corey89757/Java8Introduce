package com.java8.lambda;

/**
 * Created by zhiqiang.zhao on 2016/12/22.
 */
public class LambdaExpression {

    public static void main(String[] args) {
        //匿名类方式
        MathOperation addition = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("匿名类方式："+ addition.operation(1,1));
        //有参数类型
        MathOperation addition1 = (int a, int b) -> a + b;
        //无参数类型
        MathOperation addition2 = (a, b) -> a + b;

        System.out.println("有参数类型："+ addition1.operation(1,2));
        System.out.println("无参数类型："+ addition2.operation(3,4));

        //无圆括号
        GreetingService greeting = message -> System.out.println("Hello "+ message);
        greeting.sayMessage("World");
        //有圆括号
        GreetingService greeting2 = (message) -> System.out.println("Hello "+ message);
        greeting2.sayMessage("Payegis");

        //多条语句时使用花括号
        MathOperation subtraction  = (a, b) -> {
            System.out.println("do something");
            return a - b;
        };
        System.out.println("花括号："+subtraction.operation(4, 3));

    }
}

interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}