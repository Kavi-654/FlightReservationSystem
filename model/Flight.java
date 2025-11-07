package FlightTicketReservationSystem.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Flight {
    private static AtomicInteger id = new AtomicInteger(1);
    private int flightId;
    private String name;
    private  int availableSeats = 50;  // ✅ make it non-static
    private String source;
    private String destination;

    public Flight(String name) {
        this.name = name;
        this.flightId = id.getAndIncrement();
    }

    public int getFlightId() {
        return flightId;
    }

    public String getName() {
        return name;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Flight Name: " + name + " | ID: " + flightId + " | Available Seats: " + availableSeats;
    }

}
