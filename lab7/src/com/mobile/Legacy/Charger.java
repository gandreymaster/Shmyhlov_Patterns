//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mobile.Legacy;

public class Charger implements MicroUsbCharger {
    private final float voltage;
    private final float amperage;

    public Charger(float voltage, float amperage) {
        this.voltage = voltage;
        this.amperage = amperage;
    }

    public float getOutputVoltage() {
        return this.voltage;
    }

    public float getOutputAmperage() {
        return this.amperage;
    }
}
