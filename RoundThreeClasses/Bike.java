public class Bike extends LandTransportation {
    // Class Attributes
    private String brand;
    private int numGears;

    // Constructor
    public Bike(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, String brand, int numGears){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.brand = brand;
        this.numGears = numGears;
    }

    // Getters

    /** 
    * Gets the brand
    * @return brand
    */
    public String getBrand(){return brand;}

    /** 
    * Gets the number of gears
    * @return numGears
    */
    public int getNumGears(){return numGears;}

    // Setters

    /** 
    * Sets the brand
    * @param brand
    */
    public void setBrand(String brand){this.brand = brand;}

    /** 
    * Sets the number of gears
    * @param numGears
    */
    public void setNumGears(int numGears){this.numGears = numGears;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sBrand: %s%nNumber of Gears: %s%n",
            super.toString(),
            brand, numGears
        );
    }
}
