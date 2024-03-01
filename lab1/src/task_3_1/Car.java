package task_3_1;

public class Car {
    private Engine engine;
    private Wheel wheel;

    Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car: " +
                "Engine: " + engine +
                " Wheel: " + wheel;
    }
}
