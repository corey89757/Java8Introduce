package com.java8.defaults.methods;

import java.util.List;

/**
 * Created by zhiqiang.zhao on 2016/12/23.
 */
public class DefaultsMethod {


    public static void main(String[] args) {
        SeaPlane seaPlane = new SeaPlane();
        seaPlane.takeOff();
        seaPlane.land();
        seaPlane.cruise();
    }
}

//接口中可以有实现
interface Fly {
    default void takeOff() {
        System.out.println("Fly::takeOff");
    }

    default void land() {
        System.out.println("Fly::land");
    }

    default void cruise() {
        System.out.println("Fly::cruise");
    }
}

//可以被继承
interface FastFly extends Fly{
    default void takeOff() {
        System.out.println("FastFly::takeOff");
    }
}

class Vehicle {
    public void land() {
        System.out.println("Vehicle::land");
    }
}
//有方法被覆盖的情况下采取就近原则
class SeaPlane extends Vehicle implements FastFly, Sail{
    public void cruise() {
        FastFly.super.cruise();
    }
}

//不在同一继承体系下面，不能有方法签名相同的2个方法
interface Sail {
    default void cruise() {
        System.out.println("Sail::cruise");
    }
}
