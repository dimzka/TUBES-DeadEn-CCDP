package StrategyPattern;

public class MotorcycleWorkshop {
    public static void main(String[] args) {
        MotorcycleService motorcycleService = new MotorcycleService();

        // Menggunakan strategi Oil Change
        motorcycleService.setServiceStrategy(new OilChangeStrategy());
        motorcycleService.performService();

        // Menggunakan strategi Tire Rotation
        motorcycleService.setServiceStrategy(new TireRotationStrategy());
        motorcycleService.performService();

        // Menggunakan strategi Brake Inspection
        motorcycleService.setServiceStrategy(new BrakeInspectionStrategy());
        motorcycleService.performService();
    }
}