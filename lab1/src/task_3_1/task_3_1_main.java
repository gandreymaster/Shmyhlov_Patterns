package task_3_1;

public class task_3_1_main {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator(100, "gasoline", 20, "titanium");
        System.out.println("Car: " + carSimulator.getCar());
        carSimulator.rebuildCar(200, "diesel", 30, "iron");
        carSimulator.rebuildCar(500, "gas", 50, "titanium");
    }
}
