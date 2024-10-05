public class Train {
    // Class Attributes
    private String name;
    private double avgSpeed;
    private double ticketCost;
    private String pickupLocation;
    private int maxCapacity;
    // -rental:false

    //Constructor
    public Train(String name, double avgSpeed, double ticketCost, String pickupLocation, int maxCapacity) {
        this.name = name;
        this.avgSpeed = avgSpeed;
        this.ticketCost = ticketCost;
        this.pickupLocation = pickupLocation;
        this.maxCapacity = maxCapacity;
    }

    //Accessor Methods (getters)
    public String getName() {return name;}
    public double getAvgSpeed() {return avgSpeed;}
    public double getTicketCost() {return ticketCost;}
    public String getPickupLocation() {return pickupLocation;}
    public int getMaxCapacity() {return maxCapacity;}

    //Mutator Methods (setters)
    public void setName(String name) {this.name = name;}
    public void setAvgSpeed(double avgSpeed) {this.avgSpeed = avgSpeed;}
    public void setTicketCost(double ticketCost) {this.ticketCost = ticketCost;}
    public void setPickupLocation(String pickupLocation) {this.pickupLocation = pickupLocation;}
    public void setMaxCapacity(int maxCapacity) {this.maxCapacity = maxCapacity;}


}
