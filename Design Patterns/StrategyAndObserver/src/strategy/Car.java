package strategy;

public class Car implements PathCalculator,PureHearted{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("ETA from: " + source + " to " + " dest: " + dest + " via Car"  + " is 30 min");
    }

    @Override
    public boolean canRide(boolean isPureHearted) {
        return false;
    }
}
