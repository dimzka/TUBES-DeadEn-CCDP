public class Motorcycle {
    private String merk;
    private String model;
    private String jenisMesin;
    private int kapasitasMesin;
    private String warna;

    // Konstruktor privat untuk mencegah pembuatan objek langsung
    private Motorcycle(MotorcycleBuilder builder) {
        this.merk = builder.merk;
        this.model = builder.model;
        this.jenisMesin = builder.jenisMesin;
        this.kapasitasMesin = builder.kapasitasMesin;
        this.warna = builder.warna;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "merk='" + merk + '\'' +
                ", model='" + model + '\'' +
                ", jenisMesin='" + jenisMesin + '\'' +
                ", kapasitasMesin=" + kapasitasMesin +
                ", warna='" + warna + '\'' +
                '}';
    }

    // Getter untuk masing-masing properti
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public String getWarna() {
        return warna;
    }

    // Kelas static Builder
    public static class MotorcycleBuilder {
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
}