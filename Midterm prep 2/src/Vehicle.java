import java.util.Date;
import java.util.HashMap;

public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String name;
    private double rentalRate;
    private HashMap<Date,Integer> kilometersRecord; //rental date, num. of kilometers driven

    public Vehicle(String vehicleId, String name, double rentalRate) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.rentalRate = rentalRate;
        this.kilometersRecord = new HashMap<>();

    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public HashMap<Date, Integer> getKilometersRecord() {
        return kilometersRecord;
    }

    public void setKilometersRecord(HashMap<Date, Integer> kilometersRecord) {
        this.kilometersRecord = kilometersRecord;
    }

    public double applyDiscount(double discountRate){
        if (discountRate > 0)
            return (rentalRate - (discountRate/100));
        return rentalRate;
    }

    public double applyDiscount()
    {
        return applyDiscount(rentalRate);
    }

    public String getDescription(){
        return "ID: " + vehicleId + "\n Name: " + name + "\n Rental Rate: " + rentalRate;
    }
    public void addKilometers(Date rentalDate, int kilometers)
    {
        kilometersRecord.put(rentalDate,kilometers);
    }

    public int getTotalKilometers()
    {
        int totalKilometers = 0;
        for (Integer value : kilometersRecord.values())
        {
            totalKilometers += value;
        }
        return totalKilometers;
    }
}
