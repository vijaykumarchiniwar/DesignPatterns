package command;

public class Client {

    public static void main(String args[]) {
        Button turnOnOffButton = new Button(new TurnOnOffCommand(new Television()));
        Button muteOnOffButton = new Button(new MuteOnOffCommand(new Television()));

        turnOnOffButton.onClick();
        muteOnOffButton.onClick();
    }

}
