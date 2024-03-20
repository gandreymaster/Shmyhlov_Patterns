//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.vehiclecalculator;

public class CarCalculator implements VehicleCalculator {
    public static int averageCarPrice = 6000;
    private Vehicle vehicle;

    public CarCalculator() {
    }

    public int getRetailPrice() {
        assert this.vehicle != null;

        switch (this.vehicle.getModel()) {
            case "Ford":
                return 3000;
            case "Audi":
                return 5000;
            case "BMW":
                return 7000;
            case "Tesla":
                return 10000;
            default:
                return averageCarPrice;
        }
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String calculatePrice() {
        assert this.vehicle != null;

        int price = (int)(this.vehicle.getDamage() * (float)Math.max(this.getRetailPrice() - this.vehicle.getAge() * 100, 0));
        return "" + price + "USD";
    }
}
