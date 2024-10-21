public class Dirigible extends AirTransportation{
    // Class Attributes
    public String color;

    //Constructor
    public Dirigible(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, int altitude) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.color = color;
    }

    //Accessor Methods (getters)
    public String getColor() {return color;}

    //Mutator Methods (setters)
    public void setColor(String color) {this.color = color;}


    @Override
    public String toString(){return ".";}
}
