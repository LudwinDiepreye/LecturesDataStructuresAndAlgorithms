package lecture2.vehicles;

import lecture2.people.Passenger;

public class Taxi extends Transport {
    private boolean isAvailable;


    public Taxi(int id, int routeNumber, int capacity, boolean isAvailable) {
        super(id, routeNumber, capacity);
        this.isAvailable = isAvailable;
    }


    @Override
    public void boardPassenger(Passenger p) {
        if (isAvailable) {
            super.boardPassenger(p);
            isAvailable = false;
        } else {
            System.out.println("Taxi ID " + getId() + " not available.");
        }
    }


    @Override
    public void displayInfo() {
        System.out.println("Taxi ID: " + getId() + ", Route: " + getRouteNumber() + ", Available: " + isAvailable);
    }
}
