package task_3_2_2;

public interface Trolleybus extends Car {
    @Override
    Long getVehicleCost();
    @Override
    Long getDistanceCost(Long distance);
}
