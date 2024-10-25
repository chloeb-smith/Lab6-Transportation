public class WaterTransportation extends Transportation {

    // Class Variables
    private String waterType;

    // Constructor
    public WaterTransportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String waterType){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions);

        this.waterType = waterType;
    }

    // Getters
    
    /** 
    * Gets the water type
    * @return waterType
    */ 
    public String getWaterType(){return waterType;}

    // Setters
    
    /** 
    * Sets the water type
    * @param waterType
    */ 
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
