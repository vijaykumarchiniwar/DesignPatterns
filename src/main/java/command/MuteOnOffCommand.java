package command;

public class MuteOnOffCommand implements Command {

    private Device device;


    public MuteOnOffCommand(Device device) {
        this.device = device;
    }


    @Override
    public void execute() {
        System.out.println(this.getClass().getSimpleName());
        device.turnOnOffDevice();
    }
}
