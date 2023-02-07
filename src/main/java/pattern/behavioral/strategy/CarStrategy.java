package pattern.behavioral.strategy;

public class CarStrategy implements TravelStrategy {

    private boolean includePaidMotorways;
    private boolean includeFieldRoad;

    public CarStrategy(boolean includePaidMotorways, boolean includeFieldRoad) {
        this.includePaidMotorways = includePaidMotorways;
        this.includeFieldRoad = includeFieldRoad;
    }

    @Override
    public String setTravelPLan(String from, String to) {
        return new StringBuilder("Travel by car from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includePaidMotorways ? "including paid motorways" : "")
                .append(includeFieldRoad ? "including field roads" : "")
                .append(".")
                .toString();
    }
}
