package strategy;

import java.nio.file.Path;
import java.util.List;

public class GoogleMaps {

    private PathCalculator pathCalculator;


    public GoogleMaps(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }

    void findPath(String source, String dest) {
        pathCalculator.findPath(source,dest);
    }

    public void doSomething(PureHearted pureHearted, boolean isPure) {
        pureHearted.canRide(isPure);
    }
}
