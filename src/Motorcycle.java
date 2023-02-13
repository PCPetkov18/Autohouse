public class Motorcycle {
    private int motorcycleTireCount;
    private int motorcycleFuel;

    public Motorcycle(int motorcycleTireCount, int motorcycleFuel) {
        this.motorcycleTireCount = motorcycleTireCount;
        this.motorcycleFuel = motorcycleFuel;
    }

    Motorcycle(){
        this.motorcycleTireCount = 2;
        this.motorcycleFuel = 12;
    }

    public int getMotorcycleTireCount() {
        return motorcycleTireCount;
    }

    public void setMotorcycleTireCount(int motorcycleTireCount) {
        this.motorcycleTireCount = motorcycleTireCount;
    }

    public int getMotorcycleFuel() {
        return motorcycleFuel;
    }

    public void setMotorcycleFuel(int motorcycleFuel) {
        this.motorcycleFuel = motorcycleFuel;
    }
}
