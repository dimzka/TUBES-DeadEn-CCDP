package StrategyPattern;

public class BrakeInspectionStrategy implements ServiceStrategy {
    public void performService() {
        System.out.println("Melayani inspeksi rem");
    }
}