package com.java8.method.references;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiqiang.zhao on 2016/12/22.
 */
public class MethodReferences {

    public static void main(String[] args) {

        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
        //names.forEach(a -> System.out.println(a));

    }
}
