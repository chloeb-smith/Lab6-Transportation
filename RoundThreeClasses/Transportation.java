public class Transportation {

    // Class Variables
    private String name;
    private double averageSpeed;
    private double cost;
    private String purchaseType;
    private boolean purchased;
    private int numPurchased;
    private int maxPassengers;
    private String travelInstructions;

    // Constructor
    public Transportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions){
        this.name = name;
        this.averageSpeed = averageSpeed;
        this.cost = cost;
        this.purchaseType = purchaseType;
        this.numPurchased = numPurchased;
        this.maxPassengers = maxPassengers;
        this.travelInstructions = travelInstructions;
        this.purchased = purchased;
    }

    // Getters

    /**
    * Gets the name
    * @return name
    */
    public String getName(){return name;}

    /**
    * Gets the average speed
    * @return averageSpeed
    */
    public double getAverageSpeed(){return averageSpeed;}

    /**
    * Gets the cost
    * @return cost
    */
    public double getCost(){return cost;}

    /**
    * Gets the purchase type
    * @return purchaseType
    */
    public String getPurchaseType(){return purchaseType;}

    /**
    * Gets the purchased boolean
    * @return purchased
    */
    public boolean getPurchased(){return purchased;}

    /**
    * Gets the number purchased
    * @return numPurchased
    */
    public int getNumPurchased(){return numPurchased;}

    /**
    * Gets the maxiumum passengers 
    * @return maxPassengers
    */
    public int getMaxPassengers(){return maxPassengers;}

    /**
    * Gets the travel instructions
    * @return travelInstructions
    */
    public String getTravelInstructions(){return travelInstructions;}

    /**
    * Gets the total cost
    * @return total cost
    */
    public double getComputedTicketCost(){return cost * numPurchased;}

    /**
    * Gets the total cost
    * @return cost
    */
    public double getComputedRentalCost(){return (Math.ceil((double) numPurchased / maxPassengers)) * cost;}

    // Setters

    /**
    * Sets the name
    * @param name
    */
    public void setName(String name){this.name = name;}

    /**
    * Sets the average speed
    * @param averageSpeed
    */
    public void setAverageSpeed(double averageSpeed){this.averageSpeed = averageSpeed;}

    /**
    * Sets the cost
    * @param cost
    */
    public void setCost(double cost){this.cost = cost;}

    /**
    * Sets the purchase type
    * @param purchaseType
    */
    public void setPurchaseType(String purchaseType){this.purchaseType = purchaseType;}

    /**
    * Sets the purchased bool
    * @param purchased
    */
    public void setPurchased(boolean purchased){this.purchased = purchased;}

    /**
    * Sets the number purchased
    * @param numPurchased
    */
    public void setNumPurchased(int numPurchased){this.numPurchased = numPurchased;}

    /**
    * Sets the maximum passengers
    * @param maxPassengers
    */
    public void setMaxPassengers(int maxPassengers){this.maxPassengers = maxPassengers;}

    /**
    * Sets the travel instructions
    * @param travelInstructions
    */
    public void setTravelInstructions(String travelInstructions){this.travelInstructions = travelInstructions;}
    
    
    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    public String toString() {
        return String.format(
                "Name: %s%nSpeed: %.2f%s%nCost: $%.2f%nPurchase Type: %s%nMaximum Passengers: %s%n",
                name,
                averageSpeed, " mph",
                cost,
                purchaseType,
                maxPassengers
        );
    }
}
