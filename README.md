# Flight Booking System

A console-based flight ticket reservation system with dynamic pricing.

## Features

- **Book Tickets** - Reserve seats with passenger details
- **Cancel Tickets** - Cancel bookings with refunds
- **View Flight Details** - Display flight info and passenger list
- **Dynamic Pricing** - Price increases/decreases with bookings/cancellations

## Business Rules

### Booking
- **Capacity:** 50 seats per flight
- **Base Price:** ₹5,000 per seat
- **Price Increment:** +₹200 after each booking
- **Required Info:** Passenger name, flight name, number of seats

### Cancellation
- **Refund:** Amount paid at booking time
- **Price Decrement:** -₹200 after each cancellation (min: ₹5,000)
- **Seat Release:** Cancelled seats returned to available pool

## Pricing Example

| Booking | Price per Seat | Action |
|---------|---------------|---------|
| 1st | ₹5,000 | Book 2 seats → Next price: ₹5,200 |
| 2nd | ₹5,200 | Book 3 seats → Next price: ₹5,400 |
| Cancel | ₹5,400 → ₹5,200 | Refund at booked price |

## Sample Output
```
Book 2 seats for "John Doe" on Flight "AI101"
✓ Booking ID: 1
✓ Amount Paid: ₹10,000
✓ Available Seats: 48
✓ Next Price: ₹5,200/seat
```

## Tech Stack

- Java
- MVC Architecture
- Singleton Pattern (Repositories)

## How to Run
```bash
javac FlightTicketReservationSystem/Main.java
java FlightTicketReservationSystem.Main
```

## Constraints

- Max capacity: 50 seats
- Min price: ₹5,000
- Price step: ₹200
- Unique booking IDs (auto-generated)
