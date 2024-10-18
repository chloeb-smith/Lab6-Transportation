public class Train extends LandTransportation {

    private String fuelType;

    public Train(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, String fuelType) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.fuelType = fuelType;
    }

    public String getFuelType(){return fuelType;}
    public void setFuelType(String fuelType){this.fuelType = fuelType;}

    @Override
    public String toString(){return ".";}

}
