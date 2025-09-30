package lecture2.systems;

import lecture2.people.Driver;
import lecture2.people.Passenger;
import lecture2.vehicles.Transport;

import java.util.*;


public class CityTransportSystem {
    private List<Transport> transports = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();


    public void addTransport(Transport t) { transports.add(t); }
    public void addDriver(Driver d) { drivers.add(d); }
    public void addPassenger(Passenger p) { passengers.add(p); }


    public void displayAll() {
        transports.forEach(Transport::displayInfo);
        drivers.forEach(Driver::displayInfo);
        passengers.forEach(Passenger::displayInfo);
    }
}