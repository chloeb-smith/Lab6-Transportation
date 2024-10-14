public class Transportation {
    private String name;
    private double averageSpeed;
    private double cost;
    private int maxPassengers;
    private boolean rental;

    public Transportation(String name, double averageSpeed, double cost, int maxPassengers, boolean rental) {
        this.name = name;
        this.averageSpeed = averageSpeed;
        this.cost = cost;
        this.maxPassengers = maxPassengers;
        this.rental = rental;
    }

    // getters
    public String getName() {return name;}
    public double getAverageSpeed() {return averageSpeed;}
    public double getCost() {return cost;}
    public int getMaxPassengers() {return maxPassengers;}
    public boolean isRental() {return rental;}

    // setters
    public void setName(String name) {this.name = name;}
    public void setAverageSpeed(double averageSpeed) {this.averageSpeed = averageSpeed;}
    public void setCost(double cost) {this.cost = cost;}
    public void setMaxPassengers(int maxPassengers) {this.maxPassengers = maxPassengers;}
    public void setRental(boolean rental) {this.rental = rental;}
}
