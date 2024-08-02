// Dekorator konkret untuk inspeksi rem
public class BrakeInspection extends ServiceDecorator {
    public BrakeInspection(MotorService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + ", Inspeksi Rem";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() + 15.0;
    }
}
