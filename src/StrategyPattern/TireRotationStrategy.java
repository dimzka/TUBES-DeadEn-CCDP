package StrategyPattern;

public class TireRotationStrategy implements ServiceStrategy {
    public void performService() {
        System.out.println("Melakukan perputaran ban");
    }
}