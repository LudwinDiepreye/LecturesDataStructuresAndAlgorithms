package lecture2.vehicles;

public class Bus extends Transport {
    private boolean isDoubleDecker;


    public Bus(int id, int routeNumber, int capacity, boolean isDoubleDecker) {
        super(id, routeNumber, capacity);
        this.isDoubleDecker = isDoubleDecker;
    }


    @Override
    public void displayInfo() {
        System.out.println("Bus ID: " + getId() + ", Route: " + getRouteNumber() + ", DoubleDecker: " + isDoubleDecker);
    }
}
