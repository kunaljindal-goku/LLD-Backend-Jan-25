import java.util.ArrayList;
import java.util.List;

public class Margeritha implements Pizza{

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDescription() {
        System.out.println("This is a Margeritha pizza");
    }
}
