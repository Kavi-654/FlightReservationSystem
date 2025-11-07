package FlightTicketReservationSystem.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Passenger {
    private static AtomicInteger id = new AtomicInteger(1);
    private int passengerId;
    private String name;
    private String email;
    private String phoneNumber;
    private Gender gender;


    public Passenger(String name, String email, String phoneNumber, Gender gender) {
        this.name = name;
        this.email = email;
        this.passengerId = id.getAndIncrement();
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
              return "name is:"+getName()+"id is:"+getPassengerId();
    }
}
