package lecture2.vehicles;

public class Tram extends Transport {
    private int trackLength;


    public Tram(int id, int routeNumber, int capacity, int trackLength) {
        super(id, routeNumber, capacity);
        this.trackLength = trackLength;
    }


    @Override
    public void displayInfo() {
        System.out.println("Tram ID: " + getId() + ", Route: " + getRouteNumber() + ", Track length: " + trackLength);
    }
}