public class Boat {
    // Class Attributes
    private String name;
    private double avgSpeed;
    private String pickupLocation;
    private double cost;
    // -rental:true

    //Constructor
    public Boat(String name, double avgSpeed, String pickupLocation, double cost) {
        this.name = name;
        this.avgSpeed = avgSpeed;
        this.pickupLocation = pickupLocation;
        this.cost = cost;
    }

    //Accessor Methods (getters)
    public String getName() {return name;}
    public double getAvgSpeed() {return avgSpeed;}
    public String getPickupLocation() {return pickupLocation;}
    public double getCost() {return cost;}

    //Mutator Methods (setters)
    public void setName(String name) {this.name = name;}
    public void setAvgSpeed(double avgSpeed) {this.avgSpeed = avgSpeed;}
    public void setPickupLocation(String pickupLocation) {this.pickupLocation = pickupLocation;}
    public void setCost(double cost) {this.cost = cost;}


}
