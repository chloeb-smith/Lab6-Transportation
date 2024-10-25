public class HotAirBalloon extends AirTransportation{

    // Class Attributes
    public String basketMaterial;

    //Constructor
    public HotAirBalloon(String name, double averageSpeed, double cost, String purchaseType, boolean purchased,
                         int numPurchased, int maxPassengers, String travelInstructions, int altitude,
                         String basketMaterial) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, altitude);

        this.basketMaterial = basketMaterial;
    }

    //Accessor Methods (getters)
    public String getBasketMaterial() {return basketMaterial;}

    //Mutator Methods (setters)
    public void setBasketMaterial(String basketMaterial) {this.basketMaterial = basketMaterial;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sBasket Material: %s%n",
            super.toString(),
            basketMaterial
        );
    }
}
