package ProxyPattern;

public class RealMotorcycle implements Motorcycle {
    private String model;

    public RealMotorcycle(String model) {
        this.model = model;
        loadFromDatabase(model);
    }

    private void loadFromDatabase(String model) {
        System.out.println("Mengambil data motor model " + model + " dari database...");
    }

    @Override
    public void service() {
        System.out.println("Melakukan servis pada motor model " + model);
    }
}

