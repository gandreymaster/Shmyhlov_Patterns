package task_8_3_2;


public abstract class Button {
    protected final Size size;

    protected Button(Size size) {
        this.size = size;
    }

    abstract void draw();

}
