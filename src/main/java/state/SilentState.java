package state;

public class SilentState extends State {

    @Override
    public void handle() {
        System.out.println("SilentState");
    }
}
