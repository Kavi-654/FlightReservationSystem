package FlightTicketReservationSystem.controller;


import FlightTicketReservationSystem.model.Gender;
import FlightTicketReservationSystem.service.PassengerService;

public class PassengerController {
    private PassengerService passengerService=new PassengerService();
    public int addPassenger(String name, String email, String phoneNumber, Gender gender)
    {
        return passengerService.addPassenger(name,email,phoneNumber,gender);
    }
}
