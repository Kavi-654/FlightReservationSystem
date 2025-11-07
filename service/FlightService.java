package FlightTicketReservationSystem.service;

import FlightTicketReservationSystem.model.Flight;
import FlightTicketReservationSystem.repository.FlightRepository;

import java.util.List;

public class FlightService {
    private FlightRepository flightRepository=FlightRepository.getInstance();
    public List<Flight> displayFlightDetails()
    {

        return flightRepository.getFlightRepository();
    }
    public void increaseSeats(String name,int seats)
    {
        Flight flight=flightRepository.getFlightByName(name);
        flight.setAvailableSeats(flight.getAvailableSeats()+seats);
    }

}
