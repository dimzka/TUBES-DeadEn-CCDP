package ProxyPattern;

public class MotorcycleProxy implements Motorcycle {
    private RealMotorcycle realMotorcycle;
    private String model;

    public MotorcycleProxy(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        if (realMotorcycle == null) {
            realMotorcycle = new RealMotorcycle(model);
        }
        realMotorcycle.service();
    }
}
