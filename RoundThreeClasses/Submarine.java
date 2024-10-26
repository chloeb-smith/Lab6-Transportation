public class Submarine extends WaterTransportation{
    
    // Class Attributes
     public double depth;

    //Constructor
    public Submarine(String name, double averageSpeed, double cost, String purchaseType, boolean purchased,
                     int numPurchased, int maxPassengers, String travelInstructions, String waterType, double depth) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, waterType);

        this.depth = depth;
    }

    // Getters

    /** 
    * Gets the depth
    * @return depth
    */ 
    public double getDepth() {return depth;}

    //Setters

    /** 
    * Sets the depth
    * @param depth
    */ 
    public void setDepth(double depth) {this.depth = depth;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sDepth: %.2f%n",
            super.toString(),
            depth
        );
    }
}
