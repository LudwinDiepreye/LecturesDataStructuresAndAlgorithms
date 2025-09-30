package lecture2.vehicles;

import lecture2.interfaces.PassengerCarrier;
import lecture2.people.Passenger;

import java.util.*;


public abstract class Transport implements PassengerCarrier {
    private int id;
    private int routeNumber;
    private int capacity;
    private List<Passenger> passengers = new ArrayList<>();


    public Transport(int id, int routeNumber, int capacity) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.capacity = capacity;
    }


    public int getId() { return id; }
    public int getRouteNumber() { return routeNumber; }
    public int getCapacity() { return capacity; }


    public void move() {
        System.out.println("Transport ID " + id + " is moving on route " + routeNumber);
    }


    @Override
    public void boardPassenger(Passenger p) {
        if (passengers.size() < capacity) {
            passengers.add(p);
            System.out.println(p.getName() + " boarded transport ID " + id);
        } else {
            System.out.println("No capacity on transport ID " + id);
        }
    }


    @Override
    public void disembarkPassenger(Passenger p) {
        if (passengers.remove(p)) {
            System.out.println(p.getName() + " left transport ID " + id);
        }
    }


    public abstract void displayInfo();
}