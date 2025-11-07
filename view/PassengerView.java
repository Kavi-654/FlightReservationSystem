package FlightTicketReservationSystem.view;
import FlightTicketReservationSystem.controller.BookingController;
import FlightTicketReservationSystem.controller.PassengerController;
import FlightTicketReservationSystem.model.Gender;

import FlightTicketReservationSystem.model.Passenger;

import java.util.Scanner;

public class PassengerView {
    InputReader inputReader=new InputReader();
    private PassengerController passengerController=new PassengerController();
    private Scanner in=new Scanner(System.in);

    public void addPassenger() {
        System.out.println("Enter your Name:");
        String name = inputReader.getString();

        System.out.println("Enter your Email Id:");
        String email = inputReader.getString();

        System.out.println("Enter your Phone number:");
        String phoneNumber = inputReader.getString();

        System.out.println("Enter your Gender (MALE/FEMALE/OTHER):");
        Gender gender = null;
        try {
            String gen = inputReader.getString().toUpperCase();
            gender = Gender.valueOf(gen);
        } catch (Exception e) {
            System.out.println("Enter a valid Gender!!!");
            return;
        }

        int id = passengerController.addPassenger(name, email, phoneNumber, gender);
        if (id != 0) {
            System.out.println("Passenger Added Successfully!!");
            System.out.println("Passenger ID is: " + id);
        } else {
            System.out.println("Passenger is not added Successfully!!");
        }
    }

}
