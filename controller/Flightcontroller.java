package FlightTicketReservationSystem.controller;

import FlightTicketReservationSystem.repository.FlightRepository;
import FlightTicketReservationSystem.model.Flight;
import FlightTicketReservationSystem.service.FlightService;

import java.util.List;

public class Flightcontroller {
    private FlightService flightService = new FlightService();

    public List<Flight> displayFlightDetails() {
        return flightService.displayFlightDetails();
    }
}

