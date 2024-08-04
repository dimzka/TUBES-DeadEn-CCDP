package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        // Membangun objek Motorcycle menggunakan Builder
        Motorcycle yamaha = new Motorcycle.MotorcycleBuilder("Yamaha", "YZF-R15")
                .jenisMesin("4-tak")
                .kapasitasMesin(150)
                .warna("Hitam")
                .build();

        Motorcycle honda = new Motorcycle.MotorcycleBuilder("Honda", "CBR150R")
                .jenisMesin("4-tak")
                .kapasitasMesin(150)
                .warna("Merah")
                .build();

        // Menampilkan informasi motor
        System.out.println("Motor Yamaha: " + yamaha);
        System.out.println("Motor Honda: " + honda);
    }
}