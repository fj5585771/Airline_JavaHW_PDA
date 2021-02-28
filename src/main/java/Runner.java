public class Runner {
    public static void main(String[] args){

        Plane plane1 = new Plane(PlaneType.BOEING777);;
        Flight flight = new Flight(plane1, 815, "LA", "Sydney", "06:00");
        Passenger passenger = new Passenger("Sawyer", 1);
        System.out.println(flight.getPassengerBooked(passenger));
    }
}
