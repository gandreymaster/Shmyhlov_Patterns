package task_3_3;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.controlDevices();
    }

    public void controlDevices() {
        // TV
        Device tv = new Television();
        RemoteController tvController = setupController(tv);

        // Radio
        Device radio = new Radio();
        RemoteController radioController = setupController(radio);

        // Universal
        ArrayList<Device> devicesList = new ArrayList<>();
        devicesList.add(tv);
        devicesList.add(radio);
        RemoteController universalController = setupUniversalController(devicesList);

        // Control devices
        tvController.deviceOn();
        radioController.deviceOn();
        universalController.deviceOff();
    }

    public RemoteController setupController(Device device) {
        Command turnOn = new TurnOnCommand(device);
        Command turnOff = new TurnOffCommand(device);
        Command nextChannel = new NextChannelCommand(device);
        Command previousChannel = new PreviousChannelCommand(device);
        Command volumeUp = new VolumeUpCommand(device);
        Command volumeDown = new VolumeDownCommand(device);

        RemoteController controller = new RemoteController();
        controller.setTurnOnCommand(turnOn);
        controller.setTurnOffCommand(turnOff);
        controller.setNextChannelCommand(nextChannel);
        controller.setPreviousChannelCommand(previousChannel);
        controller.setVolumeUpCommand(volumeUp);
        controller.setVolumeDownCommand(volumeDown);

        return controller;
    }

    public RemoteController setupUniversalController(ArrayList<Device> devicesList) {
        RemoteController universalController = new RemoteController();
        Command universalTurnOff = new UniversalTurnOffCommand(devicesList);
        universalController.setTurnOffCommand(universalTurnOff);
        return universalController;
    }
}
