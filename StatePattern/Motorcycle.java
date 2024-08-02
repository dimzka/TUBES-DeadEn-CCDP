public class Motorcycle {
    private State state;

    public Motorcycle() {
        // Status awal adalah "Menunggu"
        state = new WaitingState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void masukBengkel() {
        state.masukBengkel(this);
    }

    public void perbaiki() {
        state.perbaiki(this);
    }

    public void selesaiPerbaikan() {
        state.selesaiPerbaikan(this);
    }
}