package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by zhiqiang.zhao on 2016/12/23.
 */
public class Stream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 1, 4, 5, 7, 6, 8);
//        List<Integer> collect = list.stream()
//                .filter(n -> n > 3).collect(Collectors.toList());
//        System.out.println(collect);
//        List<String> list2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        List<Integer> collect = list2.stream().map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println(collect);


//        //获取最大值
//        Optional<Integer> max = list.stream().max(Integer::compareTo);
//        System.out.println(max.get());
//
//        //top 5
        List<Integer> topFive = list.stream()
                .sorted((n1,n2) -> n2.compareTo(n1))
                .limit(5).collect(Collectors.toList());
        System.out.println(topFive);
//
//        //获取偶数
//        List<Integer> twoEvenSquares =
//                list.stream()
//                        .filter(n -> {
//                            System.out.println("filtering " + n);
//                            return n % 2 == 0;
//                        }).collect(Collectors.toList());
//        System.out.println(twoEvenSquares);
    }
}
