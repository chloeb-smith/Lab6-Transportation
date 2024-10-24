public class LandTransportation extends Transportation{
    private int numWheels;
    private String terrainType;

    public LandTransportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions);

        this.numWheels = numWheels;
        this.terrainType = terrain;
    }

    public int getNumWheels(){return numWheels;}
    public void setNumWheels(int numWheels){this.numWheels = numWheels;}

    public String getTerrainType(){return terrainType;}
    public void setTerrainType(String terrainType){this.terrainType = terrainType;}

    @Override
    public String toString(){
        return String.format(
            "%sNumber of Wheels: %s%nTerrain Type: %s%n",
            super.toString(),
            numWheels, terrainType
        );
    }
    
}
