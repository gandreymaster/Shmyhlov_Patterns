//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.mobile.Legacy;

public class MobilePhone {
    private int chargingPercent = 0;
    private MicroUsbCharger charger = null;

    public MobilePhone() {
    }

    public void pluginCharger(MicroUsbCharger charger) {
        this.charger = charger;
        System.out.println("plugin micro usb charger!");
    }

    public void unplugCharger() {
        System.out.println("unplug charger!");
        this.charger = null;
    }

    public void charge(int time) {
        if (this.charger == null) {
            System.out.println("Plugin micro usb charger");
        } else {
            float timeH = (float)time / 9.0F;
            float power = this.charger.getOutputAmperage() * this.charger.getOutputVoltage();
            int percent = this.chargingPercent + (int)(power * timeH);
            this.chargingPercent = Math.min(percent, 100);
        }
    }

    public void call(float time) {
        if ((float)this.chargingPercent < time) {
            System.out.println("Charge mobile phone!");
        } else {
            this.chargingPercent = (int)((float)this.chargingPercent + time);
            System.out.println("Calling...");
        }
    }

    public int getChargingPercent() {
        return this.chargingPercent;
    }
}
