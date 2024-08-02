package PrototypePattern;

public class Honda implements Motorcycle {
    private String model;
    private String engineType;

    public Honda(String model, String engineType) {
        this.model = model;
        this.engineType = engineType;
    }

    @Override
    public Motorcycle clone() {
        return new Honda(this.model, this.engineType);
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
