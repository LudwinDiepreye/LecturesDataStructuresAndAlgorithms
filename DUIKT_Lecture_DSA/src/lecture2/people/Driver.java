package lecture2.people;

import lecture2.vehicles.Transport;

public class Driver extends Person {
    public Driver(String name, int id) {
        super(name, id);
    }


    public void drive(Transport t) {
        System.out.println(getName() + " is driving transport ID " + t.getId());
    }


    @Override
    public void displayInfo() {
        System.out.println("Driver: " + getName() + ", ID: " + getId());
    }
}
