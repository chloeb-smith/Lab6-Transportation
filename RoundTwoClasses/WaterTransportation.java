public class WaterTransportation extends Transportation{
    public String waterType;

    public WaterTransportation(String name, double averageSpeed, double cost, int maxPassengers, boolean rental , String waterType){
        super(name, averageSpeed, cost, maxPassengers, rental);
        this.waterType = waterType;
    }

    //getters
    public String getWaterType(){return waterType;}

    //setters
    public void setWaterType(String waterType){this.waterType = waterType;}
}
