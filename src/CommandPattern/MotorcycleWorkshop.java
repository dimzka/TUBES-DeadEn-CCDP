package CommandPattern;

public class MotorcycleWorkshop {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        ServiceInvoker serviceInvoker = new ServiceInvoker();

        // Menambahkan perintah layanan
        serviceInvoker.addCommand(new OilChangeCommand(mechanic));
        serviceInvoker.addCommand(new TireRotationCommand(mechanic));
        serviceInvoker.addCommand(new BrakeInspectionCommand(mechanic));

        // Menjalankan semua perintah
        serviceInvoker.executeCommands();
    }
}
