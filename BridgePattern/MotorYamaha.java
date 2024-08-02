package BridgePattern;

public class MotorYamaha implements MotorImplementor {

    @Override
    public void servisImplementasi() {
        System.out.println("Motor Yamaha diservis.");
    }
}