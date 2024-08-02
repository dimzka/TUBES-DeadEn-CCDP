package StatePattern;

public class Main {
    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle();

        // Transisi status
        motor.masukBengkel();        // Menunggu
        motor.perbaiki();            // Diperbaiki
        motor.selesaiPerbaikan();    // Selesai

        // Coba melakukan operasi lagi setelah selesai
        motor.masukBengkel();        // Selesai
        motor.perbaiki();            // Selesai
    }
}