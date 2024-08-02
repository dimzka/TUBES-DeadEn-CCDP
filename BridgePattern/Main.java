package BridgePattern;

public class Main {
    public static void main(String[] args) {
        MotorImplementor honda = new MotorHonda();
        BengkelMotor motorHonda = new Motor(honda);
        motorHonda.servis();

        MotorImplementor yamaha = new MotorYamaha();
        BengkelMotor motorYamaha = new Motor(yamaha);
        motorYamaha.servis();
    }
}
