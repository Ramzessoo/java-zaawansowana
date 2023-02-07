package pattern.behavioral.strategy;

public class StrategyDemoApp {
    public static void main(String[] args) {
        TripPlanner tripPlaner = new TripPlanner("Otwock", "Szczyrk");
        tripPlaner.setTravelPlan(new CarStrategy(true, false));
        tripPlaner.getTripInfo();
        System.out.println("===================================");
        tripPlaner.setTravelPlan(new WalkStrategy(true));
        tripPlaner.getTripInfo();
        System.out.println("===================================");

    }
}
