package command;

public class TurnOnOffCommand implements Command {

    private Device device;


    public TurnOnOffCommand(Device device) {
        this.device = device;
    }


    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        device.turnOnOffDevice();
    }
}
