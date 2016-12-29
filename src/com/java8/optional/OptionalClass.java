package com.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by zhiqiang.zhao on 2016/12/26.
 */
public class OptionalClass {


    public static void main(String[] args) {
//        OptionalClass optionalClass = new OptionalClass();
//        Optional a = Optional.of(2);
//        Optional b = Optional.ofNullable(null);
//        Integer sum = optionalClass.sum(a, b);
//        System.out.println(sum);
//
        List<Integer> list = Arrays.asList(1,3,4,5,6,8,9);
//        Integer result = list.stream()
//                    .filter(e -> e % 2 == 0)
//                    .filter(e -> e > 3)
//                    .map(e -> e * 2)
//                    .findFirst()
//                    .orElse(0);
//        System.out.println(result);

        System.out.println(list.stream()
                .filter(OptionalClass::isEven)
                .filter(OptionalClass::isGT3)
                .map(OptionalClass::doubleIt)
                .findFirst()
                );
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){

//               //OptionalClass.isPresent - checks the value is present or not
//
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.orElse(new Integer(0));
        return value1 + value2;
    }

    private static Boolean isEven(Integer n) {
        System.out.println("isEven::当前数："+n);
        return n % 2 == 0;
    }

    private static Boolean isGT3(Integer n) {
        System.out.println("isGT3::当前数:"+n);
        return n > 3;
    }

    private static Integer doubleIt(Integer n) {
        System.out.println("doubleId::当前数："+n);
        return n * 2;
    }

}
