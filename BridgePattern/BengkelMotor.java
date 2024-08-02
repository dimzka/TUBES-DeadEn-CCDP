package BridgePattern;

public abstract class BengkelMotor {
    protected MotorImplementor motorImplementor;

    protected BengkelMotor(MotorImplementor motorImplementor) {
        this.motorImplementor = motorImplementor;
    }

    public abstract void servis();
}

