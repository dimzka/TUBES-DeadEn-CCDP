package CommandPattern;

public class TireRotationCommand implements Command {
    private Mechanic mechanic;

    public TireRotationCommand(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public void execute() {
        mechanic.rotateTires();
    }
}