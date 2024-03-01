package task_3_1;

public class CarBuilder {

    public Car buildCar(int enginePower, String fuelType, int wheelDiameter, String wheelMetal) {
        Engine engine = new Engine(enginePower, fuelType);
        Wheel wheel = new Wheel(wheelDiameter, wheelMetal);

        return new Car(engine, wheel);
    }

    public void changeCarEngine(Car car, int enginePower, String fuelType) {
        Engine engine = new Engine(enginePower, fuelType);
        car.setEngine(engine);
    }

    public void changeCarWheel(Car car, int wheelDiameter, String wheelMetal) {
        Wheel wheel = new Wheel(wheelDiameter, wheelMetal);
        car.setWheel(wheel);
    }

    public void rebuildCar(Car car, int enginePower, String fuelType, int wheelDiameter, String wheelMetal) {
        changeCarEngine(car, enginePower, fuelType);
        changeCarWheel(car, wheelDiameter, wheelMetal);
    }
}
