package task_7_3_1;

import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Charger charger = new Charger(2.4f, 1.0f);
        MobilePhone phone = new MobilePhone();
        phone.charge(10);
        phone.pluginCharger(charger);
        phone.charge(30);
        phone.unplugCharger();
        System.out.printf("Power = %s%n", phone.getChargingPercent());
        FastCharge fastCharge = new FastCharge(10);
        SamsungS samsung = new SamsungS();
        samsung.makeCall();
        samsung.pluginCharger(fastCharge);
        samsung.charge(10);
        samsung.unplugCharger();
        System.out.printf("Battery = %s%n", samsung.getChargingPercent());
        phone.pluginCharger(new AdapterTypeCToMicroUsb(fastCharge));
        phone.charge(20);
        System.out.printf("Power = %s%n", phone.getChargingPercent());
    }
}
