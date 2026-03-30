package observer;

public class IphoneScreen implements Observer{
    @Override
    public void updateScreen(double temp) {
        System.out.println("Temp of Iphone Screen updated to: "+temp);
    }
}
