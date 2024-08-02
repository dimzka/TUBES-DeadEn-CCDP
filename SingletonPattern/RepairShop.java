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
        System.out.println("Memperbaiki motor: " + motorcycle.getModel());
        System.out.println("Detail perbaikan: " + repairDetails);
    }

    public void printCurrentState() {
        System.out.println("RepairShop sedang beroperasi.");
    }
}
