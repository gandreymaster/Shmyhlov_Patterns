package task_3_2_2;

public interface Tramway extends Car {
    @Override
    Long getVehicleCost();
    Long getDistanceCost(Long distance);
}
