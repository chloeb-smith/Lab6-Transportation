public class Dirigible extends AirTransportation{
    // Class Attributes
    public String color;

    //Constructor
    public Dirigible(String name, double averageSpeed, double cost, String purchaseType, boolean purchased,
                     int numPurchased, int maxPassengers, String travelInstructions, int altitude, String color) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.color = color;
    }

    // Getters

    /** 
    * Sets the color
    * @param color
    */ 
    public String getColor() {return color;}

    // Setters

    /** 
    * Gets the color
    * @return color
    */ 
    public void setColor(String color) {this.color = color;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sColor: %s%n",
            super.toString(),
            color
        );
    }
}
