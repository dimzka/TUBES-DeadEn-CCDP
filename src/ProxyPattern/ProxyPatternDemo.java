package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new MotorcycleProxy("Honda CBR 150");
        Motorcycle motorcycle2 = new MotorcycleProxy("Yamaha R15");

        // Motor pertama
        System.out.println("Membuat permintaan servis pertama untuk Honda CBR 150");
        motorcycle1.service();
        System.out.println("\nMembuat permintaan servis kedua untuk Honda CBR 150");
        motorcycle1.service();

        // Motor kedua
        System.out.println("\nMembuat permintaan servis pertama untuk Yamaha R15");
        motorcycle2.service();
        System.out.println("\nMembuat permintaan servis kedua untuk Yamaha R15");
        motorcycle2.service();
    }
}
