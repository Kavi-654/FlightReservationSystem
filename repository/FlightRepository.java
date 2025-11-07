package FlightTicketReservationSystem.repository;

import FlightTicketReservationSystem.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    private List<Flight> flightList;
    private static FlightRepository instance;
   public FlightRepository()
    {
        flightList=new ArrayList<>();
        flightList.add(new Flight("A1001"));
        flightList.add(new Flight("B0202"));
        flightList.add(new Flight("C09090"));
    }
    public List<Flight> getFlightRepository() {
        return flightList;
    }

    public void setFlightRepository(List<Flight> flightRepository) {
        this.flightList = flightRepository;
    }
    public void addFlight(Flight flight)
    {
        flightList.add(flight);
    }
    public void removeFlight(Flight flight)
    {
        flightList.remove(flight);
    }
    public Flight getFlightById(int id)
    {
        for(Flight f:flightList)
        {
            if(f.getFlightId()==id)
            {
                return f;
            }
        }
        return null;
    }
    public Flight getFlightByName(String name)
    {
        for(Flight f:flightList)
        {
            if(f.getName().equals(name))
            {
                return f;
            }
        }
        return null;
    }
    public List<Flight> getAllFlightBookings()
    {
        return flightList;
    }
    public  static FlightRepository getInstance()
    {
        if(instance==null)
        {
            instance=new FlightRepository();
            return instance;

        }
        return instance;
    }

}
