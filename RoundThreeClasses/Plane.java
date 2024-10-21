public class Plane extends AirTransportation{
    // Class Attributes
    public String airline;

    //Constructor
    public Plane(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, int altitude) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.airline = airline;
    }

    //Accessor Methods (getters)
    public String getAirline() {return airline;}

    //Mutator Methods (setters)
    public void setAirline(String airline) {this.airline = airline;}

    @Override
    public String toString(){
        return String.format(
            "%sAirline: %s%n",
            super.toString,
            airline
        )
    }
}
