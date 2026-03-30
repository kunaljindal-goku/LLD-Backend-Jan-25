package strategy;

public class Walk implements PathCalculator{
    @Override
    public void findPath(String source, String dest) {
        System.out.println("ETA from: " + source + " to " + " dest: " + dest + " via Walk"  + " is 50 mins");

    }
}
