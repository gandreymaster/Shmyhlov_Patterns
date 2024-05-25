package task_3_3;


public class Television implements Device {

    private int volume;
    private int chanel;
    private boolean isOn;

    public Television() {
        this.isOn = false;
        this.volume = 50;
        this.chanel = 1;
    }

    @Override
    public void on() {
        if (isOn) {
            return;
        }
        System.out.println("Television is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) {
            return;
        }
        System.out.println("Television is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) {
            return;
        }
        volume++;
        System.out.println("TV Volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) {
            return;
        }
        volume--;
        System.out.println("TV Volume = " + volume);
    }

    @Override
    public void nextChannel() {
        if (!isOn) {
            return;
        }
        chanel++;
        System.out.println("TV Channel = " + chanel);
    }

    @Override
    public void prevChannel() {
        if (!isOn) {
            return;
        }
        chanel--;
        System.out.println("TV Channel = " + chanel);
    }
}
