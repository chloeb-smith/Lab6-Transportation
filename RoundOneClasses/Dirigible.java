public class Dirigible {
    // Class Attributes
    private String name;
    private double avgSpeed;
    private double cost;
    private String pickupLocation;
    private String dropOffLocation;
    // -rental:false

    //Constructor
    public Dirigible(String name, double avgSpeed, double cost, String pickupLocation, String dropOffLocation) {
        this.name = name;
        this.avgSpeed = avgSpeed;
        this.cost = cost;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
    }

    //Accessor Methods (getters)
    public String getName() {return name;}
    public double getAvgSpeed() {return avgSpeed;}
    public double getCost() {return cost;}
    public String getPickupLocation() {return pickupLocation;}
    public String getDropOffLocation() {return dropOffLocation;}

    //Mutator Methods (setters)
    public void setName(String name) {this.name = name;}
    public void setAvgSpeed(double avgSpeed) {this.avgSpeed = avgSpeed;}
    public void setCost(double cost) {this.cost = cost;}
    public void setPickupLocation(String pickupLocation) {this.pickupLocation = pickupLocation;}
    public void setDropOffLocation(String dropOffLocation) {this.dropOffLocation = dropOffLocation;}
}
