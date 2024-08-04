package BridgePattern;

public class Motor extends BengkelMotor {

    public Motor(MotorImplementor motorImplementor) {
        super(motorImplementor);
    }

    @Override
    public void servis() {
        System.out.print("Servis motor: ");
        motorImplementor.servisImplementasi();
    }
}