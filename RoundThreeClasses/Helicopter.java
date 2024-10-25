public class Helicopter extends AirTransportation{
    // Class Attributes
    public int numBlades;

    //Constructor
    public Helicopter(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, int altitude) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.numBlades = numPurchased;
    }

    //Accessor Methods (getters)
    public int getNumBlades() {return numBlades;}

    //Mutator Methods (setters)
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
