package strategy;

public class PathCalcFactory {

    public static PathCalculator getPC(String mode) {

        if(mode.equalsIgnoreCase("car")) return new Car();
        else if(mode.equalsIgnoreCase("walk")) return new Walk();
        else if(mode.equalsIgnoreCase("bus")) return new Bus();
        else if(mode.equalsIgnoreCase("nimbus")) return new Nimbus();

        return null;
    }
}
