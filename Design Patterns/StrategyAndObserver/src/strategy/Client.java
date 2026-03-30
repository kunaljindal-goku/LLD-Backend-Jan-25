package strategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mode = sc.next();
        PathCalculator pathCalculator = PathCalcFactory.getPC(mode);

        GoogleMaps maps = new GoogleMaps(pathCalculator);
        maps.findPath("Noida","New Delhi");
    }
}
