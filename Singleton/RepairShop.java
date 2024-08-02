public class RepairShop {
    // Static variable to hold the single instance
    private static RepairShop instance;

    // Private constructor to prevent instantiation from outside
    private RepairShop() {
    }

    // Method to get the single instance of RepairShop
    public static RepairShop getInstance() {
        if (instance == null) {
            instance = new RepairShop();
        }
        return instance;
    }

    // Log repair details
    public void logRepair(Motorcycle motorcycle, String repairDetails) {
        System.out.println("Repairing motorcycle: " + motorcycle.getModel());
        System.out.println("Repair details: " + repairDetails);
    }

    // Print current state
    public void printCurrentState() {
        System.out.println("RepairShop is operational.");
    }
}