package task_3_1;

public class Engine {
    private final FuelType fuelType;
    private final double power;
    private final double volume;
    private final double torque;

    Engine(FuelType fuelType, double power, double torque, double volume) {
        this.fuelType = fuelType;
        this.power = power;
        this.torque = torque;
        this.volume = volume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getPower() {
        return power;
    }

    public double getTorque() {
        return torque;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        String result = "";
        result += "\n";
        result += "- Fuel Type: " + getFuelType() + "\n";
        result += "- Power: " + getPower() + "\n";
        result += "- Torque: " + getTorque() + "\n";
        result += "- Volume: " + getVolume();
        return result;
    }
}
