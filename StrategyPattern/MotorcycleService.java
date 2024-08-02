package StrategyPattern;

public class MotorcycleService {
    private ServiceStrategy serviceStrategy;

    public void setServiceStrategy(ServiceStrategy serviceStrategy) {
        this.serviceStrategy = serviceStrategy;
    }

    public void performService() {
        if (serviceStrategy != null) {
            serviceStrategy.performService();
        } else {
            System.out.println("tidak ada layanan yang dipilih");
        }
    }
}