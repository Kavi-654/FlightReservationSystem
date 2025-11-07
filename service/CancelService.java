package FlightTicketReservationSystem.service;

import FlightTicketReservationSystem.model.Bookings;
import FlightTicketReservationSystem.model.Flight;
import FlightTicketReservationSystem.repository.BookingsRepository;
import FlightTicketReservationSystem.repository.FlightRepository;

public class CancelService {
    private BookingsRepository bookingsRepository=BookingsRepository.getInstance();
    private BookingsService bookingsService=new BookingsService();
    private FlightService flightService=new FlightService();
    public boolean cancelTicket(int bookId)
    {
        if(bookingsRepository.getBookingById(bookId)==null)
        {
            return false;
        }
        else {
            Bookings book=bookingsRepository.getBookingById(bookId);
            bookingsRepository.removeBooking(book);
            String name= book.getFlightName();
            int seats=book.getNoOfSeats();
            flightService.increaseSeats(name,seats);
            bookingsRepository.setCancelAmount();
            return true;
        }
    }
}
