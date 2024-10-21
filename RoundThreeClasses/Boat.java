public class Boat extends WaterTransportation {
    // Class Attributes
    private String boatName;
    private int numEngines;

    //Constructor
    public Boat(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String waterType) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, waterType);

        this.boatName = name;
        this.numEngines = numEngines;
    }

    //Accessor Methods (getters)
    public String getBoatName() {return boatName;}
    public int getNumEngines() {return numEngines;}

    //Mutator Methods (setters)
    public void setBoatName(String boatName) {this.boatName = boatName;}
    public void setNumEngines(int numEngines) {this.numEngines = numEngines;}

    @Override
    public String toString(){
        return String.format(
            "%sName: %s%nNumber of Engines: %d%n",
            name,
            numEngines,
        );
    }
}
