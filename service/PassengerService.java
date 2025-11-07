package FlightTicketReservationSystem.service;

import FlightTicketReservationSystem.model.Gender;

import FlightTicketReservationSystem.model.Passenger;
import FlightTicketReservationSystem.repository.BookingsRepository;
import FlightTicketReservationSystem.repository.PassengerRepository;

public class PassengerService {
//    BookingsRepository bookingsRepository=new BookingsRepository();
    private PassengerRepository passengerRepository=PassengerRepository.getInstance();
    public int  addPassenger(String name, String email, String phoneNumber, Gender gender)
    {
        Passenger one=new Passenger(name,email,phoneNumber,gender);
        passengerRepository.addPassenger(one);
        for(Passenger p:passengerRepository.getPassengerList())
        {
            System.out.println(p);
        }
        return one.getPassengerId();
    }
}
