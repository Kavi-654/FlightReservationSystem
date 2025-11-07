package FlightTicketReservationSystem.view;

import FlightTicketReservationSystem.controller.CancelController;

public class CancelView {
    private CancelController controller=new CancelController();
    private InputReader inputReader=new InputReader();
    public void cancelTicket()
    {
        System.out.println("enter your Booking Id:");
        int id=inputReader.getInt();
        boolean isCancelled=controller.cancelTicket(id);
        if(!isCancelled)
        {
            System.out.println("Booking is not Cancelled!!!");
        }
        else {
            System.out.println("Booking is cancelled!!!!");
        }
    }
}
//Implement a ticket cancellation functionality that:
//- Accepts booking ID or passenger details
//- Validates the booking exists
//- Processes cancellation
//- Calculates and processes refund
//- Updates flight information