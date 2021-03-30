package com.linteresting.designpatterns.factorymethod;

public class CarFactory {

    Vehicle create() {
        // 创建前置后置操作
        return new Car();
    }

}
