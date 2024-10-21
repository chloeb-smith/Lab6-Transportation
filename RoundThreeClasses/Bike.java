public class Bike extends LandTransportation {
    private String brand;
    private int numGears;

    public Bike(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, String brand, int numGears){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.brand = brand;
        this.numGears = numGears;
    }

    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    public int getNumGears(){return numGears;}
    public void setNumGears(int numGears){this.numGears = numGears;}

    @Override
    public String toString(){
        return String.format(
            "%sBrand: %s%nNumber of Gears: %s%n",
            super.toString,
            brand, numGears
        )
    }
}
