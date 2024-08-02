// Main.java
public class Main {
    public static void main(String[] args) {
        RepairShop shop = RepairShop.getInstance();

        Motorcycle bike1 = new Motorcycle("Yamaha R15");
        Motorcycle bike2 = new Motorcycle("Honda CBR");

        shop.logRepair(bike1, "Ganti oli mesin");
        shop.logRepair(bike2, "Penggantian kampas rem");

        shop.printCurrentState();

        RepairShop anotherShopInstance = RepairShop.getInstance();
        if (shop == anotherShopInstance) {
            System.out.println("Kedua instance adalah sama. Pola singleton berhasil!");
        } else {
            System.out.println("Instance berbeda. Pola singleton gagal!");
        }
    }
}
