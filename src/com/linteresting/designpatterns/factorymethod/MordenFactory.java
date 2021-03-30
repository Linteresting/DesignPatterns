package com.linteresting.designpatterns.factorymethod;

public class MordenFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}
