package command;

public class Television extends Device {

    @Override
    public void turnOnOffDevice() {
        System.out.println("turnOnOffDevice");
    }


    @Override
    public void muteOnOffDevice() {
        System.out.println("muteOnOffDevice");
    }
}
