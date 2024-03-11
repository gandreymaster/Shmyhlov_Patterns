package task_3_2_2;

public class SkodaTramway implements Tramway {
    private final Long vehicleCost;
    private final Integer costPerKilometer;

    SkodaTramway(Long vehicleCost, Integer costPerKilometer) {
        this.vehicleCost = vehicleCost;
        this.costPerKilometer = costPerKilometer;
    }

    @Override
    public Long getVehicleCost() {
        return vehicleCost;
    }

    @Override
    public Long getDistanceCost(Long distance) {
        return distance * costPerKilometer;
    }
}
