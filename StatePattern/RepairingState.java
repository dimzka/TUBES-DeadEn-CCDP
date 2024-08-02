package StatePattern;

public class RepairingState implements State {
    @Override
    public void masukBengkel(Motorcycle motor) {
        System.out.println("Motor sudah dalam perbaikan.");
    }

    @Override
    public void perbaiki(Motorcycle motor) {
        System.out.println("Motor sedang dalam perbaikan.");
    }

    @Override
    public void selesaiPerbaikan(Motorcycle motor) {
        System.out.println("Perbaikan motor selesai.");
        motor.setState(new CompletedState());
    }
}