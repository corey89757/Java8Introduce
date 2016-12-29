package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntToLongFunction;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by zhiqiang.zhao on 2016/12/23.
 */
public class FunctionalInterfaces {

    private static void printEven(List<Integer> values) {
        for (int e : values) {
            if (e % 2 == 0) {
                System.out.println(e);
            }
        }
    }

    private static void printGT3(List<Integer> values) {
        for (int e : values) {
            if (e > 3) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        FunctionalInterfaces.printGT3(list);

//
        System.out.println("Print all numbers:");
        //pass n as parameter
//        eval(list, n->true);
//
//        System.out.println("Print even numbers:");
//        eval(list, n -> n % 2 == 0);
//
//        System.out.println("Print numbers greater than 3:");
        eval(list, n-> n > 3 );

//        List<Integer> collect = list.stream().filter(n -> n > 3).collect(Collectors.toList());
//        System.out.println(collect);
//        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        List<Integer> collect = list2.stream().map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(collect);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    private static void printNames(String name) {
        System.out.println(name);
    }

}
