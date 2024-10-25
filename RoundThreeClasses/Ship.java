public class Ship extends WaterTransportation{
    
    // Class Attributes
    public String shipName;
    public String cargoType;

    //Constructor
    public Ship(String name, double averageSpeed, double cost, String purchaseType, boolean purchased, int numPurchased,
                int maxPassengers, String travelInstructions, String waterType, String cargoType) {
        super(name, averageSpeed, cost, purchaseType, purchased, numPurchased, maxPassengers, travelInstructions, waterType);
        this.shipName = name;
        this.cargoType = cargoType;
    }

    // Getters

    /** 
    * Gets the ship name
    * @return shipName
    */ 
    public String getShipName() {return shipName;}

    /** 
    * Gets the cargo type
    * @return cargoType
    */ 
    public String getCargoType() {return cargoType;}

    // Setters

    /** 
    * Sets the ship name
    * @param shipName
    */ 
    public void setShipName(String shipName) {this.shipName = shipName;}

    /** 
    * Sets the cargo type
    * @param cargoType
    */ 
    public void setCargoType(String cargoType) {this.cargoType = cargoType;}

    /**
    * Creates a string representation of the methods output
    * @return a string
    */
    @Override
    public String toString(){
        return String.format(
            "%sShip Name: %s%nCargo Type: %s%n",
            super.toString(),
            shipName,
            cargoType
        );
    }
}
