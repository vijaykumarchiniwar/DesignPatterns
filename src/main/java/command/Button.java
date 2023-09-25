package command;

public class Button implements ClickListener {
    Command command;


    public Button(Command command) {
        this.command = command;
    }


    @Override
    public void onClick() {
        command.execute();
    }
}
