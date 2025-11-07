package FlightTicketReservationSystem.controller;

import FlightTicketReservationSystem.model.Bookings;
import FlightTicketReservationSystem.service.BookingsService;

public class BookingController {
    private BookingsService bookingsService=new BookingsService();
    public Bookings bookTicket(int passengerId, String flightName, int seats)
    {
            return bookingsService.bookTicket(passengerId,flightName,seats);
    }
    public int GetFare(int noOfSeats)
    {
        return bookingsService.calculatePrice(noOfSeats);
    }

}
