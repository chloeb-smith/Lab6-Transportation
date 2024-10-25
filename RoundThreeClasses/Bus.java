public class Bus extends LandTransportation {

    private int routeNum;

    public Bus(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String terrain, int numWheels, int routeNum) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, terrain, numWheels);

        this.routeNum = routeNum;
    }

    public int getRouteNum(){return routeNum;}
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
