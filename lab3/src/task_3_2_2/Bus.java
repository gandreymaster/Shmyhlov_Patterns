package task_3_2_2;

public interface Bus extends Car {
    @Override
    Long getVehicleCost();

    @Override
    Long getDistanceCost(Long distance);
}
