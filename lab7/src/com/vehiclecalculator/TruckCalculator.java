//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vehiclecalculator;

public class TruckCalculator implements VehicleCalculator {
    public static int averagePrice = 10000;
    private Vehicle vehicle;

    public TruckCalculator() {
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String calculatePrice() {
        int price = Math.max(averagePrice - this.vehicle.getAge() * 100 - this.vehicle.getMileage() / 100, 0);
        return "" + price + "USD";
    }
}
