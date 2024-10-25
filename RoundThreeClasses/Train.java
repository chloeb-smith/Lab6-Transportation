public class Train extends LandTransportation {

    private String fuelType;

    public Train(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, String fuelType) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.fuelType = fuelType;
    }

    public String getFuelType(){return fuelType;}
    public void setFuelType(String fuelType){this.fuelType = fuelType;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sFuel Type: %s%n",
            super.toString(),
            fuelType
        );
    }

}
