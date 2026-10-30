class TicketBookingSystem {
    int availableSeats = 5;
    public synchronized void bookSeats(String customerName, int seatsRequested) {
        if (seatsRequested <= availableSeats) {
            System.out.println(customerName + " successfully booked " + seatsRequested);
            availableSeats -= seatsRequested;
        } else {
            System.out.println(customerName + " failed to book " + seatsRequested + " Not enough seats available.");
        }
        System.out.println("Available seats: " + availableSeats);
    }
}

class Customer extends Thread {
    TicketBookingSystem bookingSystem;
    int seatsToBook;
    public Customer(TicketBookingSystem bookingSystem, String customerName, int seatsToBook) {
        super(customerName);
        this.bookingSystem = bookingSystem;
        this.seatsToBook = seatsToBook;
    }
    @Override
    public void run() {
        bookingSystem.bookSeats(getName(), seatsToBook);
    }
}

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem(); 
        Customer c1 = new Customer(system, "Customer 1", 3);
        Customer c2 = new Customer(system, "Customer 2", 2);
        Customer c3 = new Customer(system, "Customer 3", 2);
        c1.start();
        c2.start();
        c3.start();
    }
}