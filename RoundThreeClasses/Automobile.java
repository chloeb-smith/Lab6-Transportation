public class Automobile extends LandTransportation {
    // Class Attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    public Automobile(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, String make, String model, int year) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Getters
    
    /**
    * Gets the make
    * @return make 
    */
    public String getMake(){return make;}

    /**
    * Gets the model
    * @return model 
    */
    public String getModel(){return model;}

    /**
    * Gets the year
    * @return year 
    */
    public int getYear(){return year;}

    // Setters

    /**
    * Sets the make
    * @param make 
    */
    public void setMake(String make){this.make = make;}

    /**
    * Sets the model
    * @param model 
    */
    public void setModel(String model){this.model = model;}

    /**
    * Sets the year
    * @param year 
    */
    public void setYear(int year){this.year = year;}


    
    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sMake: %s%nModel: %s%nYear: %s%n",
            super.toString(),
            make, model, year
        );
    }
}
