//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vehiclecalculator;

public class Vehicle {
    private String model;
    private final int age;
    private final int mileage;
    private final float damage;

    public Vehicle(int age, String model, float damage, int mileage) {
        this.age = age;
        this.model = model;
        this.damage = damage;
        this.mileage = mileage;
    }

    public int getAge() {
        return this.age;
    }

    public String getModel() {
        return this.model;
    }

    public float getDamage() {
        return this.damage;
    }

    public int getMileage() {
        return this.mileage;
    }
}
