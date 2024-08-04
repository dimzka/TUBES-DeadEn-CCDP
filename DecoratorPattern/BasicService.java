// Implementasi dasar dari layanan motor
public class BasicService implements MotorService {
    @Override
    public String getDescription() {
        return "Layanan dasar motor";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
