public class LandTransportation extends Transportation {
    public int numWheels;
    public String terrainType;

    public LandTransportation(String name, double averageSpeed, double cost, int maxPassengers, boolean rental , int numWheels, String terrainType) {
        super(name, averageSpeed, cost, maxPassengers, rental);
        this.numWheels = numWheels;
        this.terrainType = terrainType;
    }
    //getters
    public int getNumWheels() {return numWheels;}
    public String getTerrainType() {return terrainType;}

    //setters
    public void setNumWheels(int numWheels) {this.numWheels = numWheels;}
    public void setTerrainType(String terrainType) {this.terrainType = terrainType;}
}
