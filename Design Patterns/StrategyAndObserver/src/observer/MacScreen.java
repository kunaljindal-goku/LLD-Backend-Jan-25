package observer;

public class MacScreen implements Observer{
    @Override
    public void updateScreen(double temp) {
        System.out.println("Temp of Mac Screen changed to: "+temp*5);
    }
}
