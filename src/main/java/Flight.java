import java.util.ArrayList;

public class Flight {

    ArrayList<Passenger> passengers;
    private Plane plane;
    private int number;
    private String destination;
    private String depAirport;
    private String depTime;

    public Flight(Plane plane, int number, String destination, String depAirport, String depTime){
        passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.depAirport = depAirport;
        this.depTime = depTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepAp() {
        return this.depAirport;
    }

    public String getDepTime() {
        return this.depTime;
    }

    public
}
