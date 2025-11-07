package FlightTicketReservationSystem.view;

import FlightTicketReservationSystem.controller.BookingController;
import FlightTicketReservationSystem.model.Bookings;

public class BookingView {
    private BookingController bookingController=new BookingController();
    private InputReader inputReader=new InputReader();
    public void bookTicket()
    {
        System.out.println("Enter the Flight name:");
        String name=inputReader.getString();
        System.out.println("Enter the number of seats Required:");
        int seatsReq=inputReader.getInt();
        System.out.println("Enter the Passenger Id:");
        int passengerId=inputReader.getInt();
        int price=bookingController.GetFare(seatsReq);
       Bookings booking= bookingController.bookTicket(passengerId,name,seatsReq);


       if(booking!=null)
       {
           System.out.println("Ticket Booked SuccessFully"+
                   booking.getBookingId()+"\n"+"Amount is:"+price);
       }
       else {
           System.out.println("Ticket is not booked!!");
       }

    }
}
