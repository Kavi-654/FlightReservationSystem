package FlightTicketReservationSystem.repository;

import FlightTicketReservationSystem.model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerRepository {
    private static PassengerRepository instance;
    private List<Passenger> passengerList;
   public PassengerRepository()
    {
        this.passengerList=new ArrayList<>();
    }
    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
    public static PassengerRepository getInstance()
    {
        if(instance==null)
        {
            instance=new PassengerRepository();
        }
        return instance;
    }
    public void addPassenger(Passenger passenger)
    {
        passengerList.add(passenger);
    }
    public  void removePassenger(Passenger passenger)
    {
        passengerList.remove(passenger);
    }
    public Passenger getPassengerById(int id)
    {
        for(Passenger p:passengerList)
        {
            if(p.getPassengerId()==id)
            {
                return p;
            }
        }
        return null;
    }
    public List<Passenger> getAllPassengers()
    {
        return passengerList;
    }

}
