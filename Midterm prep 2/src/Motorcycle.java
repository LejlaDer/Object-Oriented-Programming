public class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String vehicleId, String name, double rentalRate, double engineCapacity) {
        super(vehicleId, name, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getDescription(){
        return "ID: " + getVehicleId() + "\n Name: " + getName() + "\n Rental Rate: " + getRentalRate() + "\nCar type: " +  "\n Engine capacity: " + engineCapacity ;

    }
}
