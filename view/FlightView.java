package FlightTicketReservationSystem.view;

import FlightTicketReservationSystem.controller.Flightcontroller;
import FlightTicketReservationSystem.model.Flight;

import java.util.List;

public class FlightView {
    private Flightcontroller flightcontroller=new Flightcontroller();
    public void displayFlightDetails()
    {
        List<Flight> flightDetails=flightcontroller.displayFlightDetails();
        for(Flight f:flightDetails)
        {
            System.out.println(f.toString());
        }
//        System.out.println("Fare of the flight is:"+flightcontroller.getFare());
    }
}
