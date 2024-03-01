package task_3_1;

public class Wheel {
    private final int diameter;
    private final String metalType;

    Wheel(int diameter, String metalType) {
        this.diameter = diameter;
        this.metalType = metalType;
    }

    @Override
    public String toString() {
        return "Wheel diameter=" + diameter + ", Wheel metalType='" + metalType + '\'';
    }
}
