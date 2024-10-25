public class LandTransportation extends Transportation{

    // Class Variables
    private int numWheels;
    private String terrainType;

    // Constructor
    public LandTransportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions);

        this.numWheels = numWheels;
        this.terrainType = terrain;
    }

    // Getters

    /** 
    * Gets the number of wheels
    * @return numWheels
    */ 
    public int getNumWheels(){return numWheels;}

    /** 
    * Gets the terrain type
    * @return terrainType
    */ 
    public String getTerrainType(){return terrainType;}

    // Setters

    /** 
    * Sets the number of wheels
    * @param numWheels
    */ 
    public void setNumWheels(int numWheels){this.numWheels = numWheels;}

    /** 
    * Sets the terrain type
    * @param terrainType
    */ 
    public void setTerrainType(String terrainType){this.terrainType = terrainType;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sNumber of Wheels: %s%nTerrain Type: %s%n",
            super.toString(),
            numWheels, terrainType
        );
    }
    
}
