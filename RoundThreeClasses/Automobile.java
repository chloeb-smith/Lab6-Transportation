public class Automobile extends LandTransportation {

    private String make;
    private String model;
    private int year;

    public Automobile(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, String make, String model, int year) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){return make;}
    public void setMake(String make){this.make = make;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    public int getYear(){return year;}
    public void setYear(int year){this.year = year;}

    @Override
    public String toString(){
        return String.format(
            "%sMake: %s%nModel: %s%nYear: %s%n",
            super.toString(),
            make, model, year
        );
    }
}
