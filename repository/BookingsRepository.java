package FlightTicketReservationSystem.repository;

import FlightTicketReservationSystem.model.Bookings;

import java.util.ArrayList;
import java.util.List;
public class BookingsRepository {

    private List<Bookings> bookingsList;
    private static BookingsRepository instance;
    public BookingsRepository()
    {
        bookingsList=new ArrayList<>();
    }
    public List<Bookings> getBookingRepository() {
        return bookingsList;
    }

    public void setBookingRepository(List<Bookings> bookingRepository) {
        this.bookingsList = bookingRepository;
    }
    public void addBooking(Bookings book)
    {
        bookingsList.add(book);
    }
    public void removeBooking(Bookings book)
    {
        bookingsList.remove(book);
    }
    public List<Bookings> getAllBookings()
    {
        return bookingsList;
    }
    public Bookings getBookingById(int id)
    {
        for(Bookings b:bookingsList)
        {
            if(b.getBookingId()==id)
            {
                return b;
            }
        }
        return null;
    }
    public static BookingsRepository getInstance()
    {
        if(instance==null)
        {
            instance= new BookingsRepository();
//            return instance;
        }
        return instance;

    }
    public int getAmount()
    {
        return Bookings.getPrice();
    }
    public void setAmount()
    {
        Bookings.setPrice(Bookings.getPrice()+200);
    }
    public void setCancelAmount()
    {
        Bookings.setPrice(Bookings.getPrice()-200);
    }


}
