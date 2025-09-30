package lecture2.people;

public class Passenger extends Person {
    private int ticketNumber;


    public Passenger(String name, int id, int ticketNumber) {
        super(name, id);
        this.ticketNumber = ticketNumber;
    }


    public int getTicketNumber() { return ticketNumber; }


    @Override
    public void displayInfo() {
        System.out.println("Passenger: " + getName() + ", Ticket: " + ticketNumber);
    }
}