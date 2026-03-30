package strategy;

public class Bus implements PathCalculator{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("ETA from: " + source + " to " + " dest: " + dest + " via Bus"  + " is 35 mins");

    }
}
