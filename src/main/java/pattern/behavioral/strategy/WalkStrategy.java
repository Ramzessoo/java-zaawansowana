package pattern.behavioral.strategy;

public class WalkStrategy implements TravelStrategy{

    private boolean includeTouristPaths;

    public WalkStrategy(boolean includeTouristPaths) {
        this.includeTouristPaths = includeTouristPaths;
    }

    @Override
    public String setTravelPLan(String from, String to) {
        return new StringBuilder("Travel by food from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includeTouristPaths ? " including tourist paths." : ".")
                .toString();
    }
}
