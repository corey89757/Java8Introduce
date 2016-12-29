package com.java8.method.references;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created by zhiqiang.zhao on 2016/12/22.
 */
public class MethodReferences2 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Mahesh"));
        people.add(new Person("Suresh"));
        people.add(new Person("Ramesh"));
        people.add(new Person("Naresh"));
        people.add(new Person("Kalpesh"));

        //Lambda表达式方式
//        Collections.sort(people, (p1, p2)-> p1.name.compareTo(p2.name));
//        people.forEach(person -> System.out.println(person.name));

        //静态方法引用
//        Collections.sort(people, Person::compareByName);
//        people.forEach(person -> System.out.println(person.name));

        //实例方法引用
//        ComparisonProvider comparisonProvider = new ComparisonProvider();
//        Collections.sort(people, comparisonProvider::compareByName);
//        people.forEach(person -> System.out.println(person.name));

        //专属实例引用
//        List<String> stringArray = Arrays.asList("Barbara", "James", "Mary", "John",
//                "Patricia", "Robert", "Michael", "Linda");
//        Collections.sort(stringArray, String::compareToIgnoreCase);
//        stringArray.forEach(System.out::println);


        Set<Person> rosterSetLambda =
                transferElements(people, () -> { return new HashSet<>(); });
        people.forEach(person -> System.out.println(person.name));
        //构造引用
        Set<Person> rosterSet = transferElements(people, HashSet::new);
        people.forEach(person -> System.out.println(person.name));
    }

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name);
    }
}

class ComparisonProvider {
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

}