package com.linteresting.designpatterns.factorymethod;

public class MainTest {

    public static void main(String[] args) {
        Vehicle car = new CarFactory().create();
        car.go();
        Weapon gun = new GunFactory().create();
        gun.shoot();

        // 抽象工厂生产产品族
        // 工厂方法生产单一产品
        // 扩展性： 工厂方法扩展产品
        // 抽象工厂扩展一族
        MordenFactory mf = new MordenFactory();
        Vehicle mCar = mf.createVehicle();
        Weapon mGun = mf.createWeapon();
        mCar.go();
        mGun.shoot();

    }

}
