package FlightTicketReservationSystem.service;

import FlightTicketReservationSystem.model.Bookings;
import FlightTicketReservationSystem.model.Flight;
import FlightTicketReservationSystem.repository.BookingsRepository;
import FlightTicketReservationSystem.repository.FlightRepository;
import FlightTicketReservationSystem.repository.PassengerRepository;

public class BookingsService {
      private BookingsRepository bookingsRepository=BookingsRepository.getInstance();
      private PassengerRepository passengerRepository=PassengerRepository.getInstance();
      private FlightRepository flightRepository=FlightRepository.getInstance();
      public Bookings bookTicket(int passengerId,String flightName,int noOfSeats)
      {
          if(passengerRepository.getPassengerById(passengerId)!=null)
          {
              Flight flight=flightRepository.getFlightByName(flightName);
              if( flight !=null && flight.getAvailableSeats()>=noOfSeats) {
                  Bookings bookings = new Bookings(flightName, passengerId,noOfSeats);
                  flight.setAvailableSeats(flight.getAvailableSeats()-noOfSeats);
                  bookingsRepository.addBooking(bookings);
              return bookings;
              }
              else {
                  return null;
              }

          }
          return null;
      }
      public int calculatePrice(int noOfSeats)
      {
          int ans=noOfSeats*bookingsRepository.getAmount();
          bookingsRepository.setAmount();
          return ans;
      }

}
