package com.java8.introduce;

import java.lang.invoke.MethodHandles;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * Created by zhiqiang.zhao on 2016/12/22.
 */
public class Java8Introduce {
    public static void main(String args[]){
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
//        for (int i = 0; i < values.size(); i++) {
//            System.out.println(values.get(i));
//        }
//
//        for (Integer i : values) {
//            System.out.println(i);
//        }

        values.forEach(Java8Introduce::print);




//        values.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer value) {
//                System.out.println(value);
//            }
//        });
//        values.forEach((Integer value) -> System.out.println(value));
//        values.forEach((Integer value) -> System.out.println(value));
//        values.forEach((Integer value) -> System.out.println(value));
        values.forEach((Integer value) -> System.out.println(value));

    }


    private static void print(Integer a) {
        System.out.println(a);
    }
}
