public class WaitingState implements State {
    @Override
    public void masukBengkel(Motorcycle motor) {
        System.out.println("Motor sudah dalam status menunggu.");
    }

    @Override
    public void perbaiki(Motorcycle motor) {
        System.out.println("Memulai perbaikan motor.");
        motor.setState(new RepairingState());
    }

    @Override
    public void selesaiPerbaikan(Motorcycle motor) {
        System.out.println("Motor belum diperbaiki, tidak dapat menyelesaikan perbaikan.");
    }
}