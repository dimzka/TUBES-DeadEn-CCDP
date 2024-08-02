package CommandPattern;

public class OilChangeCommand implements Command {
    private Mechanic mechanic;

    public OilChangeCommand(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    @Override
    public void execute() {
        mechanic.changeOil();
    }
}
