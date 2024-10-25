public class Boat extends WaterTransportation {
    
    // Class Attributes
    private String boatName;
    private int numEngines;

    //Constructor
    public Boat(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased,
                int maxPassengers, String travelInstructions, String waterType, String boatName, int numEngines) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, waterType);

        this.boatName = name;
        this.numEngines = numEngines;
    }

    // Getters

    /** 
    * Gets the boat name
    * @return boatName
    */ 
    public String getBoatName() {return boatName;}

    /** 
    * Gets the number of engines
    * @return numEngines
    */ 
    public int getNumEngines() {return numEngines;}

    // Setters

    /** 
    * Sets the boat name
    * @param boatName
    */ 
    public void setBoatName(String boatName) {this.boatName = boatName;}

    /** 
    * Sets the number of engines
    * @param numEngines
    */ 
    public void setNumEngines(int numEngines) {this.numEngines = numEngines;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sName: %s%nNumber of Engines: %d%n",
            super.toString(),
            boatName,
            numEngines
        );
    }
}
