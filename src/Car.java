public class Car {
    private int carTireCount;
    private int carFuel;

    public Car(int carTireCount, int carFuel) {
        this.carTireCount = carTireCount;
        this.carFuel = carFuel;
    }

    Car(){
        this.carTireCount = 5;
        this.carFuel = 55;
    }

    public int getCarTireCount() {
        return carTireCount;
    }

    public void setCarTireCount(int carTireCount) {
        this.carTireCount = carTireCount;
    }

    public int getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(int carFuel) {
        this.carFuel = carFuel;
    }
}
