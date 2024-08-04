package CommandPattern;

public class BrakeInspectionCommand implements Command {
    private Mechanic mechanic;

    public BrakeInspectionCommand(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public void execute() {
        mechanic.inspectBrakes();
    }
}