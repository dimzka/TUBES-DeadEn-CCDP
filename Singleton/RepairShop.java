public class RepairShop {
    private static RepairShop instance;

    private RepairShop() {
    }

    public static RepairShop getInstance() {
        if (instance == null) {
            instance = new RepairShop();
        }
        return instance;
    }

    public void logRepair(Motorcycle motorcycle, String repairDetails) {
        System.out.println("Repairing motorcycle: " + motorcycle.getModel());
        System.out.println("Repair details: " + repairDetails);
    }

    public void printCurrentState() {
        System.out.println("RepairShop is operational.");
    }
}