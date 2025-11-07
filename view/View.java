package FlightTicketReservationSystem.view;

import FlightTicketReservationSystem.controller.Flightcontroller;
import FlightTicketReservationSystem.controller.PassengerController;
import FlightTicketReservationSystem.repository.FlightRepository;

public class View {
    private InputReader input=new InputReader();
    private PassengerView passengerView=new PassengerView();
    private FlightView flightview=new FlightView();
    private BookingView bookView=new BookingView();
    private CancelView cancelView=new CancelView();
    public void start()
    {
        System.out.println("----------- Flight Ticket Booking System ----------");
        System.out.println("1.Registration As Passenger");
        System.out.println("2.Book Ticket");
        System.out.println("3.Cancel Ticket");
        System.out.println("4.Display Flight Details");
        System.out.println("5.Exit");
        System.out.println("Enter Any one of the option:");

        while(true)
        {
            int option= input.getInt();
            switch (option) {
                case 1:
                    passengerView.addPassenger();
                    break;
                case 2:
//                    passengerView.addPassenger();
                    flightview.displayFlightDetails();
                    bookView.bookTicket();
                    break;
                case 3:
                    cancelView.cancelTicket();
                    break;
                case 4:
                    flightview.displayFlightDetails();
                    break;
                case 5:
                    System.out.println("Thank you For visiting Please Visit Us Again");
                    return;
                default:
                    System.out.println("Enter a valid Option!!");
                    break;
            }
        }
    }
}
