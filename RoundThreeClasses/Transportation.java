public class Transportation {
    private String name;
    private double averageSpeed;
    private double cost;
    private String purchaseType;
    private boolean purchased;
    private int numPurchased;
    private int maxPassengers;
    private String travelInstructions;

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

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public double getAverageSpeed(){return averageSpeed;}
    public void setAverageSpeed(double averageSpeed){this.averageSpeed = averageSpeed;}

    public double getCost(){return cost;}
    public void setCost(double cost){this.cost = cost;}

    public String getPurchaseType(){return purchaseType;}
    public void setPurchaseType(String purchaseType){this.purchaseType = purchaseType;}

    public boolean getPurchased(){return purchased;}
    public void setPurchased(boolean purchased){this.purchased = purchased;}

    public int getNumPurchased(){return numPurchased;}
    public void setNumPurchased(int numPurchased){this.numPurchased = numPurchased;}

    public int getMaxPassengers(){return maxPassengers;}
    public void setMaxPassengers(int maxPassengers){this.maxPassengers = maxPassengers;}

    public String getTravelInstructions(){return travelInstructions;}
    public void setTravelInstructions(String travelInstructions){this.travelInstructions = travelInstructions;}

    public double getComputedTicketCost(){return cost * numPurchased;}
    public double getComputedRentalCost(){return (Math.ceil((double) numPurchased / maxPassengers)) * cost;}


    public String toString() {
        return String.format(
                "Name: %s%nSpeed: %f%nCost: %f%nPurchase Type: %s%nMaximum Passengers: %s%n",
                name,
                averageSpeed,
                cost,
                purchaseType,
                maxPassengers
        );
    }
}
