public class Ship extends WaterTransportation{
    // Class Attributes
    public String shipName;
    public String cargoType;

    //Constructor
    public Ship(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased, int maxPassengers, String travelInstructions, String waterType) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, waterType);
        this.shipName = name;
        this.cargoType = cargoType;
    }

    //Accessor Methods (getters)
    public String getShipName() {return shipName;}
    public String getCargoType() {return cargoType;}

    //Mutator Methods (setters)
    public void setShipName(String shipName) {this.shipName = shipName;}
    public void setCargoType(String cargoType) {this.cargoType = cargoType;}

    @Override
    public String toString(){
        return String.format(
            "%sShip Name: %s%nCargo Type: %s%n",
            name,
            cargoType;
        )
    }
}
