package StatePattern;

public class CompletedState implements State {
    @Override
    public void masukBengkel(Motorcycle motor) {
        System.out.println("Motor sudah diperbaiki, tidak perlu masuk bengkel lagi.");
    }

    @Override
    public void perbaiki(Motorcycle motor) {
        System.out.println("Motor sudah selesai diperbaiki.");
    }

    @Override
    public void selesaiPerbaikan(Motorcycle motor) {
        System.out.println("Motor sudah selesai diperbaiki dan siap diambil.");
    }
}