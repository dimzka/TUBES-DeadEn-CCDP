public class Main {
    public static void main(String[] args) {
        RepairShop shop = RepairShop.getInstance();

        Motorcycle bike1 = new Motorcycle("Yamaha R15");
        Motorcycle bike2 = new Motorcycle("Honda CBR");

        shop.logRepair(bike1, "Oli mesin diganti");
        shop.logRepair(bike2, "Kampas rem diganti");

        shop.printCurrentState();

        RepairShop anotherShopInstance = RepairShop.getInstance();
        if (shop == anotherShopInstance) {
            System.out.println("cek singleton : sukses!");
        } else {
            System.out.println("cek singleton : gagal!");
        }
    }
}