package pattern.behavioral.strategy;

public class TripPlanner {

    private String startPoint;
    private String destination;
    private String finalRoute;

    public TripPlanner(String startPoint, String destination) {
        this.startPoint = startPoint;
        this.destination = destination;

    }
    public void setTravelPlan(TravelStrategy travelStrategy) {
        finalRoute = travelStrategy.setTravelPLan(startPoint, destination);
    }

    public void getTripInfo() {
        System.out.println("=================================");
        System.out.println("Travelling from " + startPoint + " to " + destination);
        System.out.println("===========Details===============");
        System.out.println(finalRoute);
        System.out.println("==================================");
    }
}
