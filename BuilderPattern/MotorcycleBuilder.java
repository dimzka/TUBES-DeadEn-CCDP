public class MotorcycleBuilder {
    private String merk;
    private String model;
    private String jenisMesin;
    private int kapasitasMesin;
    private String warna;

    public MotorcycleBuilder(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public MotorcycleBuilder jenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
        return this;
    }

    public MotorcycleBuilder kapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
        return this;
    }

    public MotorcycleBuilder warna(String warna) {
        this.warna = warna;
        return this;
    }

    // Metode build() untuk membuat objek Motorcycle
    public Motorcycle build() {
        return new Motorcycle(this);
    }
}