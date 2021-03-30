package com.linteresting.designpatterns.factorymethod;

public class Gun extends Weapon {
    @Override
    void shoot() {
        System.out.println("gun shoot...");
    }
}
