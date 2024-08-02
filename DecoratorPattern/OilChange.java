// Dekorator konkret untuk mengganti oli
public class OilChange extends ServiceDecorator {
    public OilChange(MotorService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + ", Ganti Oli";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() + 20.0;
    }
}
