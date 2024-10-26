public class Helicopter extends AirTransportation{
    
    // Class Attributes
    public int numBlades;

    //Constructor
    public Helicopter(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, int altitude, int numBlades) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.numBlades = numBlades;
    }

    // Getters 

    /** 
    * Gets the number of blades
    * @return numBlades
    */ 
    public int getNumBlades() {return numBlades;}

    // Setters
    
    /** 
    * Sets the number of blades
    * @param num
    */ 
    public void setNumBlades(int num) {this.numBlades = num;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sBlades: %s%n",
            super.toString(),
            numBlades
        );
    }
}
