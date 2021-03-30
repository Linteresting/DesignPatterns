package com.linteresting.designpatterns.factorymethod;

public class GunFactory {

    Weapon create() {
        return new Gun();
    }

}
