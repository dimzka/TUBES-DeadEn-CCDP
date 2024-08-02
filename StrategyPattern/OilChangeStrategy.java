package StrategyPattern;

public class OilChangeStrategy implements ServiceStrategy {
    public void performService() {
        System.out.println("Melakukan perubahan oli");
    }
}