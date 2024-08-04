// Dekorator abstrak yang mengimplementasikan interface MotorService
public abstract class ServiceDecorator implements MotorService {
    protected MotorService decoratedService;

    public ServiceDecorator(MotorService decoratedService) {
        this.decoratedService = decoratedService;
    }

    public String getDescription() {
        return decoratedService.getDescription();
    }

    public double getCost() {
        return decoratedService.getCost();
    }
}
