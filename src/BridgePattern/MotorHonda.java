package BridgePattern;

public class MotorHonda implements MotorImplementor {

    @Override
    public void servisImplementasi() {
        System.out.println("Motor Honda diservis.");
    }
}