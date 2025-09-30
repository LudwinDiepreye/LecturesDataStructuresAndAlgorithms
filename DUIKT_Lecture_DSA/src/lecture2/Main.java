package lecture2;

import lecture2.people.Driver;
import lecture2.people.Passenger;
import lecture2.systems.CityTransportSystem;
import lecture2.vehicles.Bus;
import lecture2.vehicles.Taxi;
import lecture2.vehicles.Tram;

public class Main {
    public static void main(String[] args) {
        CityTransportSystem system = new CityTransportSystem();


        Bus bus = new Bus(1, 101, 2, true);
        Tram tram = new Tram(2, 202, 3, 50);
        Taxi taxi = new Taxi(3, 303, 1, true);


        Driver d1 = new Driver("Alex", 1);
        Driver d2 = new Driver("Maya", 2);
        Driver d3 = new Driver("Ivan", 3);


        Passenger p1 = new Passenger("Anna", 1, 111);
        Passenger p2 = new Passenger("Bohdan", 2, 112);
        Passenger p3 = new Passenger("Olia", 3, 113);
        Passenger p4 = new Passenger("Petro", 4, 114);
        Passenger p5 = new Passenger("Sofia", 5, 115);


        system.addTransport(bus);
        system.addTransport(tram);
        system.addTransport(taxi);


        system.addDriver(d1);
        system.addDriver(d2);
        system.addDriver(d3);


        system.addPassenger(p1);
        system.addPassenger(p2);
        system.addPassenger(p3);
        system.addPassenger(p4);
        system.addPassenger(p5);


            // Quick demo
        bus.boardPassenger(p1);
        bus.boardPassenger(p2);
        bus.boardPassenger(p3); // This will exceed capacity


        taxi.boardPassenger(p4);
        taxi.boardPassenger(p5); // Taxi not available anymore


        tram.boardPassenger(p5);


        d1.drive(bus);


        system.displayAll();
    }
}