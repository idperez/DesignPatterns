package command;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() { }

    public void setCommmand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
