public class Bus extends LandTransportation {
    // Class Variables
    private int routeNum;

    // Constructor
    public Bus(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, int routeNum) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.routeNum = routeNum;
    }

    // Getters

    /** 
    * Gets the route number
    * @return routeNum
    */ 
    public int getRouteNum(){return routeNum;}

    // Setters

    /** 
    * Sets the route number
    * @param routeNum
    */ 
    public void setRouteNum(int routeNum){this.routeNum = routeNum;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sRoute Number: %d%n",
            super.toString(),
            routeNum
        );
    }

}
