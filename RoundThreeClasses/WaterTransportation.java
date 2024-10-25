public class WaterTransportation extends Transportation {

    private String waterType;

    public WaterTransportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String waterType){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions);

        this.waterType = waterType;
    }
    public String getWaterType(){return waterType;}
    public void setWaterType(String waterType){this.waterType = waterType;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sWater Type: %s%n",
            super.toString(),
            waterType
        );
    }
}
