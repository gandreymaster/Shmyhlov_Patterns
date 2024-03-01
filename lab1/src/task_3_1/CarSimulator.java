package task_3_1;

public class CarSimulator {

    private final CarBuilder carBuilder;
    private final Car car;

    CarSimulator(int enginePower, String fuelType, int wheelDiameter, String wheelMetal) {
        this.carBuilder = new CarBuilder();
        this.car = carBuilder.buildCar(enginePower, fuelType, wheelDiameter, wheelMetal);
    }

    public void rebuildCar(int enginePower, String fuelType, int wheelDiameter, String wheelMetal) {
        carBuilder.rebuildCar(car, enginePower, fuelType, wheelDiameter, wheelMetal);
        System.out.println("New car: " + car);
    }

    public Car getCar() {
        return car;
    }
}
