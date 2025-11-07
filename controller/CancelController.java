package FlightTicketReservationSystem.controller;

import FlightTicketReservationSystem.service.CancelService;

public class CancelController {
    private CancelService cancelService=new CancelService();
    public boolean cancelTicket(int id)
    {
       return cancelService.cancelTicket(id);
    }
}
