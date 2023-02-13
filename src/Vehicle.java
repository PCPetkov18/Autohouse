public class Vehicle {
    private int VIN;
    private String vehicleModel;
    private String vehicleMake;
    private int vehicleHorsePower;
    private double vehiclePrice;

    public Vehicle(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, double vehiclePrice) {
        this.VIN = VIN;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.vehicleHorsePower = vehicleHorsePower;
        this.vehiclePrice = vehiclePrice;
    }

    Vehicle(){
        this.VIN = 1235456;
        this.vehicleModel = "Roadster I";
        this.vehicleMake = "Tesla";
        this.vehicleHorsePower = 478;
        this.vehiclePrice = 47398.98;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getVehicleHorsePower() {
        return vehicleHorsePower;
    }

    public void setVehicleHorsePower(int vehicleHorsePower) {
        this.vehicleHorsePower = vehicleHorsePower;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
}
