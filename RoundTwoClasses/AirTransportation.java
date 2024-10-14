public class AirTransportation extends Transportation{
    public int altitude;

    public AirTransportation(String name, double averageSpeed, double cost, int maxPassengers, boolean rental , int altitude){
        super(name, averageSpeed, cost, maxPassengers, rental);
        this.altitude = altitude;
    }

    //getters
    public int getAltitude(){return altitude;}

    //setters
    public void setAltitude(int altitude){this.altitude = altitude;}
}
