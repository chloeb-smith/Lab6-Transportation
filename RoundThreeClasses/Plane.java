public class Plane extends AirTransportation{
    
    // Class Attributes
    public String airline;

    //Constructor
    public Plane(String name, double averageSpeed, double cost, String purchaseType, boolean purchased,
                 int numPurchased, int maxPassengers, String travelInstructions, int altitude, String airline) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.airline = airline;
    }

    // Getters

    /** 
    * Gets the airline
    * @return airline
    */ 
    public String getAirline() {return airline;}

    // Setters

    /** 
    * Sets the airline
    * @params airline
    */ 
    public void setAirline(String airline) {this.airline = airline;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sAirline: %s%n",
            super.toString(),
            airline
        );
    }
}
