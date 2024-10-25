public class AirTransportation extends Transportation {
    
    // Class Variables
    private int altitude;

    // Constructor
    public AirTransportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased,
                             int numPurchased, int maxPassengers, String travelInstructions, int altitude){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions);

        this.altitude = altitude;
    }
    \
    // Getters
    
    /**
    * Gets the altitude
    * @return altitude 
    */
    public int getAltitude(){return altitude;}

    // Setters
    
    /**
    * Sets the altitude
    * @param altidude
    */
    public void setAltitude(int altitude){this.altitude = altitude;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sAltitude: %s%n",
            super.toString(),
            altitude
        );
    }
}
