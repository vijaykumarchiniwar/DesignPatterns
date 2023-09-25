package state;

public class Client {

    public static void main(String args[]) {
        Phone phone = new Phone();
        phone.setCurrentState(new VibrationState());
        phone.handle();

        phone.setCurrentState(new SilentState());
        phone.handle();
    }
}
