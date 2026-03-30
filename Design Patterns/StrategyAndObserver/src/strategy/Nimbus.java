package strategy;

public class Nimbus implements PathCalculator, PureHearted{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("ETA from: " + source + " to " + " dest: " + dest + " via Car"  + " is 3 secs");
    }

    public boolean canRide(boolean isPureHearted) {
        return isPureHearted;
    }
}
