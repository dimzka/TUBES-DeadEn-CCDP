public class Main {
    public static void main(String[] args) {
        // Get the single instance of RepairShop
        RepairShop shop = RepairShop.getInstance();

        // Create some motorcycles
        Motorcycle bike1 = new Motorcycle("Yamaha R15");
        Motorcycle bike2 = new Motorcycle("Honda CBR");

        // Log repairs
        shop.logRepair(bike1, "Engine oil change");
        shop.logRepair(bike2, "Brake pad replacement");

        // Print the current state of the repair shop
        shop.printCurrentState();

        // Demonstrating singleton behavior
        RepairShop anotherShopInstance = RepairShop.getInstance();
        if (shop == anotherShopInstance) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Different instances. Singleton pattern failed!");
        }
    }
}