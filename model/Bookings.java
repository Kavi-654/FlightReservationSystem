package FlightTicketReservationSystem.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Bookings {

    private static AtomicInteger idGenerator = new AtomicInteger(1);

    private int bookingId;
    private String flightName;
    private int customerId;
    private int noOfSeats;
    private static int price = 5000;

    public Bookings(String flightName, int customerId, int noOfSeats) {
        this.bookingId = idGenerator.getAndIncrement();
        this.flightName = flightName;
        this.customerId = customerId;
        this.noOfSeats = noOfSeats;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getFlightName() {
        return flightName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Bookings.price = price;
    }
}
