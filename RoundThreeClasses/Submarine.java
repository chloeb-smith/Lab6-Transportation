public class Submarine extends WaterTransportation{
    // Class Attributes
     public double depth;

    //Constructor
    public Submarine(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String waterType) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, waterType);

        this.depth = depth;
    }

    //Accessor Methods (getters)
    public double getDepth() {return depth;}

    //Mutator Methods (setters)
    public void setDepth(double depth) {this.depth = depth;}

    @Override
    public String toString(){
        return String.format(
            "%sDepth: %f%n",
            depth
        )
    }
}
