package task_3_1;

public class Engine {
    private final int power;
    private final String fuel;

    Engine(int power, String fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Engine power=" + power + ", fuel=" + fuel;
    }
}
