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

//    returns capacity of plane
    public int getAvailableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }

//    returns current ArrayList of passengers
    public int getPassengerCount(){
        return this.passengers.size();
    }

    //  adds to passenger list if there is enough capacity
    public void getPassengerBooked(Passenger passenger) {
        if (getPassengerCount() < getAvailableSeats()) {
            this.passengers.add(passenger);
        }
    }

//    calculates how much baggage weight each passenger is allowed
    public int baggageWeight(){
        return this.plane.getTotalWeight() / 2;
        }

    public int baggage4EachPassenger(){
        int bagWeight = this.baggageWeight();
        int weightForEachPassenger = bagWeight / this.plane.getCapacity();
        return weightForEachPassenger;
    }

    public int maxBaggageCanBeBooked(){
        int maxBaggageBooked = 0;
        ArrayList<Passenger> listOfPassengers = this.passengers;
        for (Passenger passenger : listOfPassengers){
            maxBaggageBooked += passenger.getNumberOfBags() * 10;
        }
        return maxBaggageBooked;
    }





}
