// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        MotorService basicService = new BasicService();
        System.out.println(basicService.getDescription() + " biaya: " + basicService.getCost());

        MotorService oilChangeService = new OilChange(basicService);
        System.out.println(oilChangeService.getDescription() + " biaya: " + oilChangeService.getCost());

        MotorService fullService = new BrakeInspection(oilChangeService);
        System.out.println(fullService.getDescription() + " biaya: " + fullService.getCost());
    }
}
