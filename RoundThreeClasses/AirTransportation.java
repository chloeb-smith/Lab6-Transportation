public class AirTransportation extends Transportation {
    private int altitude;

    public AirTransportation(String name, double averageSpeed, double cost, String purchaseType, boolean purchased,
                             int numPurchased, int maxPassengers, String travelInstructions, int altitude){
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions);

        this.altitude = altitude;
    }
    public int getAltitude(){return altitude;}
    public void setAltitude(int altitude){this.altitude = altitude;}

    @Override
    public String toString(){
        return String.format(
            "%sAltitude: %s%n",
            super.toString(),
            altitude
        );
    }
}
